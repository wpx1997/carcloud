package com.joinwe.carcloud.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 小case
 * created on 2020/5/18 9:30
 */
@Data
public class CompanyQueryDTO {
    private BigDecimal longitude;
    private BigDecimal latitude;
    private Integer indexPageNum;
    private Integer size;
    private String bussinessTypeId;
    private String name;
    private String tel;
}
