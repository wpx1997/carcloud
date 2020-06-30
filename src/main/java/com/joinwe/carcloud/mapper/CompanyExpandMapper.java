package com.joinwe.carcloud.mapper;

import com.joinwe.carcloud.dto.CompanyQueryDTO;
import com.joinwe.carcloud.dto.CompanyMessageDTO;

import java.util.List;

/**
 * created by 小case on 2020/5/18 9:41
 */
public interface CompanyExpandMapper {

    List<CompanyMessageDTO> selectByLocationWithPage(CompanyQueryDTO companyQueryDTO);
    List<CompanyMessageDTO> selectByLocationWithBussinessTypeId(CompanyQueryDTO companyQueryDTO);
    List<CompanyMessageDTO> selectCompanyByNameOrTel(CompanyQueryDTO companyQueryDTO);
}
