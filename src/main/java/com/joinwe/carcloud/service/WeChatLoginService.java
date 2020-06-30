package com.joinwe.carcloud.service;

import com.joinwe.carcloud.dto.WeChatLoginDTO;
import com.joinwe.carcloud.model.WxUser;
import com.joinwe.carcloud.wechatapplet.wechatlogin.AppletPhoneResult;
import com.joinwe.carcloud.wechatapplet.wechatlogin.WeChatLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidParameterSpecException;
import java.util.List;

/**
 * @author 小case
 * @date 2020/6/22 15:52
 * @Description WeChatLoginService is
 */
@Service
public class WeChatLoginService {

    @Autowired
    private UserService userService;

    public String getPhoneNumber(WeChatLoginDTO weChatLoginDTO) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, InvalidParameterSpecException {

        List<WxUser> wxUserList = userService.selectWxUserByOpenId(weChatLoginDTO.getOpenId());
        if (wxUserList.isEmpty()){
            return "不存在";
        }

        AppletPhoneResult appletPhoneResult = WeChatLogin.phoneDecrypt(weChatLoginDTO.getEncryptedData(), weChatLoginDTO.getIv(), wxUserList.get(0).getToken());

        return appletPhoneResult.getPurePhoneNumber();
    }
}
