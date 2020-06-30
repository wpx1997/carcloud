package com.joinwe.carcloud.controller;

import com.joinwe.carcloud.dto.CompanyQueryDTO;
import com.joinwe.carcloud.dto.ResultDTO;
import com.joinwe.carcloud.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 小case
 * created on 2020/5/19 14:30
 */
@RestController
@RequestMapping("/wx/center")
public class WxCenterController {

    @Autowired
    private CompanyService companyService;

    /**
     * @author: 小case
     * @date: 2020/5/29
     * @description: 根据商家类型返回商家列表
     * @Param: companyQueryDTO
     * @return: Object
     */
    @ResponseBody
    @RequestMapping("/getCompanyByCompanyTypeId")
    public Object getCompanyByCompanyTypeId(@RequestBody CompanyQueryDTO companyQueryDTO){

        Map<String,Object> map = companyService.selectCompanyByBussinessTypeId(companyQueryDTO);

        return ResultDTO.okOf(map);
    }

    /**
     * @author: 小case
     * @date: 2020/5/29
     * @description: 模糊查询商家
     * @Param: companyQueryDTO
     * @return: Object
     */
    @ResponseBody
    @RequestMapping("/getCompany")
    public Object getCompany(@RequestBody CompanyQueryDTO companyQueryDTO){

        Map<String,Object> map = companyService.selectCompanyByNameOrTel(companyQueryDTO);

        return ResultDTO.okOf(map);
    }

}
