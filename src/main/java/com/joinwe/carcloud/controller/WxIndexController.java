package com.joinwe.carcloud.controller;

import com.joinwe.carcloud.dto.*;
import com.joinwe.carcloud.service.*;
import com.joinwe.carcloud.wechatapplet.wechatpay.parameter.WeChatPayResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.validation.Valid;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidParameterSpecException;
import java.util.Map;

/**
 * @author 小case
 */
@RestController
@RequestMapping("/wx")
public class WxIndexController {

    @Autowired
    private UserService userService;

    @Autowired
    private PictureService pictureService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private WeChatPayService weChatPayService;

    @Autowired
    private WeChatLoginService weChatLoginService;

    /**
     *
     * getOpenId 获取OpenId和Session_key
     *
     * @author: 小case
     * @date: 2020/6/16 14:58
     * @param jsCode
     * @return: Object
     */
    @GetMapping("/getOpenId/{code}")
    public Object getOpenId(@PathVariable(name = "code") String jsCode) throws NoSuchFieldException, IllegalAccessException {

        Long id = userService.getOpenIdByCode(jsCode);

        return ResultDTO.okOf(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getPhone",method = RequestMethod.POST)
    public Object getPhone(@RequestBody @Valid WeChatLoginDTO weChatLoginDTO) throws NoSuchPaddingException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidParameterSpecException {

        String phoneNumber = weChatLoginService.getPhoneNumber(weChatLoginDTO);

        return ResultDTO.okOf(phoneNumber);
    }

    /**
     *
     * isFirstLogin 判断是否第一次登录
     *
     * @author: 小case
     * @date: 2020/6/16 14:59
     * @param openId
     * @return: Object
     */
    @GetMapping("/isFirstLogin/{openId}")
    public Object isFirstLogin(@PathVariable(name = "openId") String openId){

        Boolean isFirstLogin = userService.firstLogin(openId);
        if (isFirstLogin){
            return ResultDTO.okOf(2001);
        }
        return ResultDTO.okOf(200);
    }

    /**
     *
     * weChatPay 唤起微信支付并返回调起密码支付框所需的参数
     *
     * @author: 小case
     * @date: 2020/6/16 15:00
     * @param weChatPayDTO
     * @return: Object
     */
    @ResponseBody
    @RequestMapping(value = "/pay/wechatpay",method = RequestMethod.POST)
    public Object weChatPay(@RequestBody @Valid WeChatPayDTO weChatPayDTO) throws Exception {

        WeChatPayResult weChatPayResult = weChatPayService.callWeChatPay(weChatPayDTO);

        if (weChatPayResult.getReturnCode() && weChatPayResult.getResultCode()){
            return ResultDTO.okOf(weChatPayResult.getPaymentMap());
        }

        return ResultDTO.errorOf(2005,weChatPayResult.getMessage());
    }

    /**
     *
     * mchPay 进行微信企业支付
     *
     * @author: 小case
     * @date: 2020/6/16 15:00
     * @param openId
     * @return: Object
     */
    @GetMapping("/pay/mchpay/{openId}")
    public Object mchPay(@PathVariable(name = "openId")String openId) throws Exception {

        WeChatPayResult weChatPayResult = weChatPayService.callMchPay(openId);
        if (weChatPayResult.getReturnCode() && weChatPayResult.getResultCode()){
            return ResultDTO.okOf(weChatPayResult.getPaymentMap());
        }

        return ResultDTO.errorOf(2003,weChatPayResult.getMessage());
    }

    /**
     *
     * payRefund 微信订单退款
     *
     * @author: 小case
     * @date: 2020/6/16 15:01
     * @param
     * @return: Object
     */
    @GetMapping("/pay/payrefund")
    public Object payRefund() throws Exception {

        WeChatPayResult weChatPayResult = weChatPayService.callPayRefund();
        if (weChatPayResult.getReturnCode() && weChatPayResult.getResultCode()){
            return ResultDTO.okOf(weChatPayResult.getPaymentMap());
        }

        return ResultDTO.errorOf(2003,weChatPayResult.getMessage());
    }

    /**
     *
     * addUserWx 微信小程序用户登录处理
     *
     * @author: 小case
     * @date: 2020/6/16 15:01
     * @param wxUserDTO
     * @return: Object
     */
    @ResponseBody
    @RequestMapping(value = "/addUserWx",method = RequestMethod.POST)
    public Object addUserWx(@RequestBody WxUserDTO wxUserDTO){

        Boolean isFirstLogin = userService.firstLogin(wxUserDTO.getOpenId());
        Long userId = userService.createOrUpdateWxUser(wxUserDTO,isFirstLogin);

        return ResultDTO.okOf(userId);
    }

    /**
     *
     * getPicture 获取轮播图
     *
     * @author: 小case
     * @date: 2020/6/16 15:03
     * @param
     * @return: Object
     */
    @GetMapping("/index/getPicture")
    public Object getPicture(){

        Map<String,Object> map = pictureService.selectByPictureLocation();

        return ResultDTO.okOf(map);
    }

    /**
     *
     * getCompanyType 获取商家类型
     *
     * @author: 小case
     * @date: 2020/6/16 15:03
     * @param
     * @return: Object
     */
    @GetMapping("/index/getCompanyType")
    public Object getCompanyType(){

        Map<String,Object> map = pictureService.selectByCompanyType();

        return ResultDTO.okOf(map);
    }

    /**
     *
     * listNeighbouringCompany 获取附近商家
     *
     * @author: 小case
     * @date: 2020/6/16 15:03
     * @param companyQueryDTO
     * @return: Object
     */
    @ResponseBody
    @RequestMapping(value = "/index/pageNeighbouringCompany",method = RequestMethod.POST)
    public Object listNeighbouringCompany(@RequestBody CompanyQueryDTO companyQueryDTO){

        Map<String,Object> map = companyService.listByCompanyQueryDTO(companyQueryDTO);

        return ResultDTO.okOf(map);
    }

}
