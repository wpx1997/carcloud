package com.joinwe.carcloud.service;

import com.joinwe.carcloud.model.CompanyType;
import com.joinwe.carcloud.model.CompanyTypeExample;
import com.joinwe.carcloud.model.Picture;
import com.joinwe.carcloud.model.PictureExample;
import com.joinwe.carcloud.mapper.CompanyTypeMapper;
import com.joinwe.carcloud.mapper.PictureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * created by 小case on 2020/5/15 10:47
 */
@Service
public class PictureService {

    @Autowired
    private PictureMapper pictureMapper;

    @Autowired
    private CompanyTypeMapper companyTypeMapper;

    @Autowired
    private ResultService resultService;

//    查询并返回轮播图
    public Map<String, Object> selectByPictureLocation() {

        PictureExample pictureExample = new PictureExample();
        List<Picture> pictureList = pictureMapper.selectByExample(pictureExample);
        Map<String,Object> map = resultService.mapPutWithList("pictureList",pictureList);

        return map;
    }

//    根据置顶情况和置顶顺序查询并返回商家类别信息
    public Map<String, Object> selectByCompanyType() {

        CompanyTypeExample companyTypeExample = new CompanyTypeExample();
        companyTypeExample.createCriteria().andIsLockedEqualTo(false);
        companyTypeExample.setOrderByClause("sort");
        List<CompanyType> companyTypeList = companyTypeMapper.selectByExample(companyTypeExample);
        Map<String,Object> map = resultService.mapPutWithList("pageList",companyTypeList);

        return map;
    }
}
