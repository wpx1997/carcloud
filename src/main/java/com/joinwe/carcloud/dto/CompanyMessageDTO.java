package com.joinwe.carcloud.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 小case
 * created on 2020/5/18 14:36
 */
@Data
public class CompanyMessageDTO implements Comparable<CompanyMessageDTO> {
    private Long id;
    private String name;
    private String bussinesstypeid;
    private String bussinesstypename;
    private String cover;
    private String serviceTime;
    private String tel;
    private String province;
    private String city;
    private String district;
    private String address;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String picturelist;
    private String service;
    private String description;
    private Date gmtCreate;
    private Long creatorid;
    private Date gmtModified;
    private Long editorid;
    private Boolean isDeleted;
    private Boolean isLocked;
    private Long version;
    private Double distance;

    @Override
    public int compareTo(CompanyMessageDTO companyMessageDTO) {
        return (int) (this.distance - companyMessageDTO.getDistance());
    }
}
