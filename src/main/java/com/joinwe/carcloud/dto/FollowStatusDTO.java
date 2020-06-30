package com.joinwe.carcloud.dto;

import lombok.Data;

/**
 * @author 小case
 * created on 2020/5/19 10:46
 */
@Data
public class FollowStatusDTO {

    /**
     * @author: 小case
     * @date: 2020/6/16 15:52
     * @description: 是否有收藏记录
     */
    private Boolean follow;

    /**
     * @author: 小case
     * @date: 2020/6/16 15:53
     * @description: 是否还存在关系
     */
    private Boolean status;

    /**
     * @author: 小case
     * @date: 2020/6/16 15:54
     * @description: 收藏记录的id
     */
    private Long id;

}
