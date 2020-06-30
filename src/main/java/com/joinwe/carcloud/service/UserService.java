package com.joinwe.carcloud.service;

import com.joinwe.carcloud.dto.WebUserLoginDTO;
import com.joinwe.carcloud.dto.WxUserDTO;
import com.joinwe.carcloud.mapper.WebUserMapper;
import com.joinwe.carcloud.mapper.WxUserMapper;
import com.joinwe.carcloud.model.WebUser;
import com.joinwe.carcloud.model.WebUserExample;
import com.joinwe.carcloud.model.WxUser;
import com.joinwe.carcloud.model.WxUserExample;
import com.joinwe.carcloud.wechatapplet.wechatlogin.AppletLoginResult;
import com.joinwe.carcloud.wechatapplet.wechatlogin.WeChatLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 不会飞的小鹏
 * created on 2020/5/15 11:51
 */
@Service
public class UserService {

    @Autowired
    private WxUserMapper wxUserMapper;

    @Autowired
    private WebUserMapper webUserMapper;

    /**
     * firstLogin 判断是否第一次登录
     *
     * @param openId
     * @author: 小case
     * @date: 2020/6/16 15:28
     * @return: Boolean
     */
    public Boolean firstLogin(String openId) {

        List<WxUser> wxUserList = selectWxUserByOpenId(openId);
        if (wxUserList.isEmpty()) {
            return true;
        }
        return false;
    }

    public List<WxUser> selectWxUserByOpenId(String openId) {
        WxUserExample wxUserExample = new WxUserExample();
        wxUserExample.createCriteria().andOpenIdEqualTo(openId);
        List<WxUser> wxUserList = wxUserMapper.selectByExample(wxUserExample);

        return wxUserList;
    }

    /**
     * createOrUpdateWxUser
     *
     * @param wxUserDTO
     * @param isFirstLogin
     * @author: 小case
     * @date: 2020/6/16 15:28
     * @return: Long
     */
    public Long createOrUpdateWxUser(WxUserDTO wxUserDTO, Boolean isFirstLogin) {

        Long userId;
//        如果当前用户为新用户，插入数据   否则跟新
        if (isFirstLogin) {
            WxUser wxUser = new WxUser();
            wxUser.setOpenId(wxUserDTO.getOpenId());
            wxUser.setAvatarUrl(wxUser.getAvatarUrl());
            wxUser.setName(wxUserDTO.getName());
            wxUser.setGmtCreate(System.currentTimeMillis());

            wxUserMapper.insert(wxUser);
            userId = wxUser.getId();
        } else {
            List<WxUser> wxUserList = selectWxUserByOpenId(wxUserDTO.getOpenId());
            WxUser wxUser = wxUserList.get(0);
            wxUser.setOpenId(wxUserDTO.getOpenId());
            wxUser.setAvatarUrl(wxUserDTO.getAvatar());
            wxUser.setName(wxUserDTO.getName());
            wxUser.setGmtModified(System.currentTimeMillis());

            wxUserMapper.updateByPrimaryKey(wxUser);
            userId = wxUser.getId();
        }

        return userId;
    }

    /**
     * selectWebUserByToken 查验用户的session状态
     *
     * @param token
     * @author: 小case
     * @date: 2020/6/16 15:30
     * @return: List<WebUser>
     */
    public List<WebUser> selectWebUserByToken(String token) {

        WebUserExample webUserExample = new WebUserExample();
        webUserExample.createCriteria().andTokenEqualTo(token);
        List<WebUser> webUserList = webUserMapper.selectByExample(webUserExample);

        return webUserList;
    }

    /**
     * loginVerify
     *
     * @param webUserLoginDTO
     * @author: 小case
     * @date: 2020/6/16 15:33
     * @return: List<WebUser>
     */
    public List<WebUser> loginVerify(WebUserLoginDTO webUserLoginDTO) {

        WebUserExample webUserExample = new WebUserExample();
        webUserExample.createCriteria().andLoginNameEqualTo(webUserLoginDTO.getLoginName()).andPasswordEqualTo(webUserLoginDTO.getPassword());
        List<WebUser> webUserList = webUserMapper.selectByExample(webUserExample);

        return webUserList;
    }

    public void updateWebUser(WebUser webUser) {
        webUserMapper.updateByPrimaryKey(webUser);
    }

    /**
     * getOpenIdByCode 通过前端返回的code获取用户的session_key和openId
     *
     * @param jsCode
     * @author: 小case
     * @date: 2020/6/16 15:32
     * @return: AppletLoginResult
     */
    public Long getOpenIdByCode(String jsCode) throws NoSuchFieldException, IllegalAccessException {

        // 调用openId和sessionKey接口查询接口
        AppletLoginResult appletLoginResult = WeChatLogin.getOpenIdAndSessionKeyByJsCode(jsCode);

        // 从数据库查询是否已存在
        String openId = appletLoginResult.getOpenid();
        String sessionKey = appletLoginResult.getSession_key();
        List<WxUser> wxUserList =  selectWxUserByOpenId(openId);
        if (wxUserList.isEmpty()){
            WxUser wxUser = new WxUser();
            wxUser.setOpenId(openId);
            wxUser.setToken(sessionKey);
            wxUser.setGmtCreate(System.currentTimeMillis());
            wxUser.setGmtModified(System.currentTimeMillis());
            wxUserMapper.insert(wxUser);
            Long id = wxUser.getId();

            return id;
        }
        WxUser wxUser = wxUserList.get(0);
        wxUser.setToken(sessionKey);
        wxUser.setGmtModified(System.currentTimeMillis());
        wxUserMapper.updateByPrimaryKey(wxUser);

        return wxUser.getId();
    }
}
