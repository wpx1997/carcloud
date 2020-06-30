package com.joinwe.carcloud.dto;

import com.joinwe.carcloud.model.ServiceItem;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 小case
 * created on 2020/5/18 15:32
 */
@Data
public class CompanyDTO {
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
    private Date gmtCreate;
    private Long creatorid;
    private Date gmtModified;
    private Long editorid;
    private Boolean isDeleted;
    private Boolean isLocked;
    private Long version;
    private String pictureList;
    private String service;
    private String description;
    private List<ServiceItem> serviceItemList;
}
