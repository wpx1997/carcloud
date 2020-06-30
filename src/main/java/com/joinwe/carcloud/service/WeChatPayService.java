package com.joinwe.carcloud.service;

import com.joinwe.carcloud.dto.WeChatPayDTO;
import com.joinwe.carcloud.wechatapplet.wechatpay.WeChatPayHandle;
import com.joinwe.carcloud.wechatapplet.wechatpay.parameter.WeChatPayParameter;
import com.joinwe.carcloud.wechatapplet.wechatpay.parameter.WeChatPayResult;
import com.joinwe.carcloud.wechatapplet.wechatpay.parameter.WeChatRefundParameter;
import org.springframework.stereotype.Service;

/**
 * @author 小case
 * @date 2020/5/25 17:29
 */
@Service
public class WeChatPayService {

    /**
     * @author: 小case
     * @description: TODO
     * @date: 2020/6/8 16:47
     * @Param: weChatPayDTO
     * @return: WeChatPayResult
     */
    public WeChatPayResult callWeChatPay(WeChatPayDTO weChatPayDTO) throws Exception {

        WeChatPayParameter weChatPayParameter = new WeChatPayParameter();
        weChatPayParameter.setDetails(weChatPayDTO.getBody());
        weChatPayParameter.setOpenId(weChatPayDTO.getOpenId());
        weChatPayParameter.setPrice(weChatPayDTO.getOriginalTotalFee());

        WeChatPayResult weChatPayResult = WeChatPayHandle.unifiedOrder(weChatPayParameter);

/*
        后续订单处理
        if ((Boolean) unifiedOrderMap.get("orderStatus")){

        }
*/
        return weChatPayResult;
    }

    /**
     * @author: 小case
     * @description: TODO
     * @date: 2020/6/8 16:47
     * @Param: openId
     * @return: WeChatPayResult
     */
    public WeChatPayResult callMchPay(String openId) throws Exception {

        WeChatPayParameter weChatPayParameter = new WeChatPayParameter();
        weChatPayParameter.setDetails("测试使用");
        Double price = 1.0;
        weChatPayParameter.setPrice(price);
        weChatPayParameter.setOpenId(openId);

        WeChatPayResult weChatPayResult = WeChatPayHandle.mchPay(weChatPayParameter);
        return weChatPayResult;
    }

    /**
     * @author: 小case
     * @description: TODO
     * @date: 2020/6/8 16:43
     * @Param:
     * @return: WeChatPayResult
     */
    public WeChatPayResult callPayRefund() throws Exception {

        WeChatRefundParameter weChatRefundParameter = new WeChatRefundParameter();
        Double d = 0.02;
        String preTradeNo = "20200602142438159107907862926000";

        weChatRefundParameter.setTotalFee(d);
        weChatRefundParameter.setRefundFee(d);
        weChatRefundParameter.setTradeNo(preTradeNo);
        WeChatPayResult weChatPayResult = WeChatPayHandle.payRefund(weChatRefundParameter);

        return weChatPayResult;
    }

}
