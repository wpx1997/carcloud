package com.joinwe.carcloud.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author 不会飞的小鹏
 * create on 2020/6/22 15:56
 * @Description WeChatLoginDTO is
 */
@Data
public class WeChatLoginDTO {


    @NotBlank(message = "openId不能为空")
    private String openId;

    @NotBlank(message = "目标密文不能为空")
    private String encryptedData;

    @NotBlank(message = "加密初始向量不能为空")
    private String iv;

}
