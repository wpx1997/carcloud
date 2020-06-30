package com.joinwe.carcloud.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author 小case
 * created on 2020/5/19 9:50
 */
@Data
public class FollowDTO {
    @NotNull(message = "用户Id为空")
    private Long userId;
    @NotNull(message = "商户Id为空")
    private Long companyId;
    private String companyName;
    private String companyCover;
    private String companyProvince;
    private String companyCity;
    private String companyDistrict;
    private String companyAddress;
}
