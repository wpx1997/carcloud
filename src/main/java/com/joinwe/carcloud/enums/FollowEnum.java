package com.joinwe.carcloud.enums;

/**
 * @author 不会飞的小鹏
 * created by 小case on 2020/5/19 10:16
 */
public enum FollowEnum {

    /**
     * @author: 不会飞的小鹏
     * @date: 2020/6/22 11:27
     * @description: FollowEnum's
     */
    FOLLOW_NULL(0),
    FOLLOW_IS_FOLLOW(1),
    FOLLOW_IS_NOT_FOLLOW(2),
    ;

    private Integer status;

    FollowEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus(){
        return status;
    }
}
