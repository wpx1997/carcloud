package com.joinwe.carcloud.dto;

import lombok.Data;

/**
 * @author 小case
 * created on 2020/5/22 15:19
 */
@Data
public class WebUserLoginDTO {

    /**
     * @author: 小case
     * @date: 2020/6/8 16:57
     * @description: 用户登录名
     */
    private String loginName;

    /**
     * @author: 小case
     * @date: 2020/6/8 16:59
     * @description: 用户登录密码
     */
    private String password;
}
