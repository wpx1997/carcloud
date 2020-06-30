package com.joinwe.carcloud.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author 小case
 * created on 2020/5/27 14:02
 */
@Data
public class WeChatPayDTO {

    /**
     * @author: 小case
     * @date: 2020/6/16 15:49
     * @description: 订单描述
     */
    @NotBlank(message = "描述不能为空")
    private String body;

    /**
     * @author: 小case
     * @date: 2020/6/16 15:50
     * @description: 订单价格
     */
    @NotNull(message = "价格不能为空")
    private Double originalTotalFee;

    /**
     * @author: 小case
     * @date: 2020/6/16 15:50
     * @description: 用户openId
     */
    @NotBlank(message = "用户openId不能为空")
    private String openId;

}
