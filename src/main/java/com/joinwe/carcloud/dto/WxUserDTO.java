package com.joinwe.carcloud.dto;

import lombok.Data;

/**
 * @author 小case
 * created on 2020/5/18 17:28
 */
@Data
public class WxUserDTO {

    /**
     * @author: 小case
     * @date: 2020/6/16 15:50
     * @description: 用户openId
     */
    private String openId;

    /**
     * @author: 小case
     * @date: 2020/6/16 15:51
     * @description: 用户名
     */
    private String name;

    /**
     * @author: 小case
     * @date: 2020/6/16 15:52
     * @description: 用户头像地址
     */
    private String avatar;

}
