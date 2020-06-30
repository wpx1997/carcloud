package com.joinwe.carcloud.service;

import com.joinwe.carcloud.dto.*;
import com.joinwe.carcloud.mapper.CompanyExpandMapper;
import com.joinwe.carcloud.mapper.CompanyMapper;
import com.joinwe.carcloud.mapper.FollowMapper;
import com.joinwe.carcloud.mapper.ServiceItemMapper;
import com.joinwe.carcloud.model.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * created by 小case on 2020/5/18 10:23
 */
@Service
public class CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private CompanyExpandMapper companyExpandMapper;

    @Autowired
    private FollowMapper followMapper;

    @Autowired
    private ResultService resultService;

    @Autowired
    private ServiceItemMapper serviceItemMapper;

    /**
     *
     * listByCompanyQueryDTO 根据当前位置查询商家并根据距离进行升序返回
     *
     * @author: 不会飞的小鹏
     * @date: 2020/6/23 21:33
     * @param companyQueryDTO
     * @return: Map<String,Object>
     */
    public Map<String, Object> listByCompanyQueryDTO(CompanyQueryDTO companyQueryDTO) {

        CompanyExample companyExample = new CompanyExample();
        List<Company> companyList = companyMapper.selectByExample(companyExample);

//        将所有商家与当前位置进行距离计算并升序返回
        Map<String, Object> map = setCompanyListByDistanceWithPage(companyQueryDTO, companyList);

        return map;
    }

    /**
     *
     * setCompanyListByDistanceWithPage 将商家列表与当前位置进行距离计算并升序分页返回
     *
     * @author: 不会飞的小鹏
     * @date: 2020/6/23 21:33
     * @param companyQueryDTO
     * @param companyList
     * @return: Map<String,Object>
     */
    public Map<String, Object> setCompanyListByDistanceWithPage(CompanyQueryDTO companyQueryDTO, List<Company> companyList) {
        Double latitude = companyQueryDTO.getLatitude().doubleValue();
        Double longitude = companyQueryDTO.getLongitude().doubleValue();
        List<CompanyMessageDTO> companyMessageDTOList = new ArrayList<>();
        for (Company company : companyList) {
            Double dLatitude = company.getLatitude().doubleValue();
            Double dLongitude = company.getLongitude().doubleValue();
            CompanyMessageDTO companyMessageDTO = new CompanyMessageDTO();
            BeanUtils.copyProperties(company, companyMessageDTO);
//            将当前商家与当前位置进行距离计算
            Double distance = getDistance(latitude, longitude, dLatitude, dLongitude);
            companyMessageDTO.setDistance(Double.valueOf(String.format("%.1f", distance)));
            companyMessageDTOList.add(companyMessageDTO);
        }
        Collections.sort(companyMessageDTOList);
        List<CompanyMessageDTO> subCompanyMessageDTOList;
        Integer size = companyQueryDTO.getSize();
        Integer offset = (companyQueryDTO.getIndexPageNum() - 1) * size;
        Integer toIndex = offset + size - 1;
        if (offset >= companyMessageDTOList.size()) {
            Map<String, Object> map = resultService.mapPutWithList("companyList", null);
            return map;
        }
        if (toIndex <= companyMessageDTOList.size()) {
            subCompanyMessageDTOList = companyMessageDTOList.subList(offset, toIndex);
        } else {
            subCompanyMessageDTOList = companyMessageDTOList.subList(offset, companyMessageDTOList.size() - 1);
        }
        Map<String, Object> map = resultService.mapPutWithList("companyList", subCompanyMessageDTOList);

        return map;
    }

    /**
     *
     * getDistance 通过当前位置与商家位置进行距离计算
     *
     * @author: 不会飞的小鹏
     * @date: 2020/6/23 21:33
     * @param latitude
     * @param longitude
     * @param dLatitude
     * @param dLongitude
     * @return: Double
     */
    private Double getDistance(Double latitude, Double longitude, Double dLatitude, Double dLongitude) {
        Double distance = 6378.137 * 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(((latitude - dLatitude) * Math.PI) / 180 / 2), 2) + Math.cos(latitude * Math.PI / 180) * Math.cos(dLatitude * Math.PI / 180) * Math.pow(Math.sin(((longitude - dLongitude) * Math.PI) / 180 / 2), 2)));
        return distance;
    }

    /**
     *
     * setCompanyMessageDTOListByDistance 将商家列表与当前位置进行距离计算并升序返回
     *
     * @author: 不会飞的小鹏
     * @date: 2020/6/23 21:33
     * @param companyQueryDTO
     * @param companyMessageDTOList
     * @return: Map<String,Object>
     */
    public Map<String, Object> setCompanyMessageDTOListByDistance(CompanyQueryDTO companyQueryDTO, List<CompanyMessageDTO> companyMessageDTOList) {
        Double latitude = companyQueryDTO.getLatitude().doubleValue();
        Double longitude = companyQueryDTO.getLongitude().doubleValue();
        for (CompanyMessageDTO companyMessageDTO : companyMessageDTOList) {
            Double dLatitude = companyMessageDTO.getLatitude().doubleValue();
            Double dLongitude = companyMessageDTO.getLongitude().doubleValue();

            // 将当前商家与当前位置进行距离计算
            Double distance = getDistance(latitude, longitude, dLatitude, dLongitude);
            companyMessageDTO.setDistance(Double.valueOf(String.format("%.1f", distance)));
        }
        Collections.sort(companyMessageDTOList);

        Map<String, Object> map = resultService.mapPutWithList("companyList", companyMessageDTOList);

        return map;
    }

    /**
     *
     * selectCompanyById 根据商家ID返回商家具体信息
     *
     * @author: 不会飞的小鹏
     * @date: 2020/6/23 21:33
     * @param companyId
     * @return: Map<String,Object>
     */
    public Map<String, Object> selectCompanyById(Long companyId) {

        CompanyWithBLOBs company = companyMapper.selectByPrimaryKey(companyId);

//        返回当前商家的服务列表
        ServiceItemExample serviceItemExample = new ServiceItemExample();
        serviceItemExample.createCriteria().andCompanyIdEqualTo(companyId).andCompanyIdBetween(1L, 2L);

        serviceItemMapper.selectByPrimaryKey(1L);
        ServiceItem serviceItem = new ServiceItem();
        serviceItem.setCompanyId(1L);

        List<ServiceItem> serviceItemList = serviceItemMapper.selectByExample(serviceItemExample);
        CompanyDTO companyDTO = new CompanyDTO();
        BeanUtils.copyProperties(company, companyDTO);
        companyDTO.setServiceItemList(serviceItemList);

        Map<String, Object> map = resultService.mapPutWithList("companyDetail", companyDTO);

        return map;
    }

    /**
     * @author: 小case
     * @date: 2020/5/28 10:51
     * @description: 根据用户ID和商家ID查询是否已有follow记录, 并返回follow状态
     * @Param: userId
     * @Param: companyId
     * @return: FollowStatusDTO
     */
    public FollowStatusDTO followStatus(Long userId, Long companyId) {

        FollowExample followExample = new FollowExample();
        followExample.createCriteria().andUserIdEqualTo(userId).andCompanyIdEqualTo(companyId);
        List<Follow> followList = followMapper.selectByExample(followExample);
        FollowStatusDTO followStatusDTO = new FollowStatusDTO();

        if (followList.size() == 0) {
            followStatusDTO.setFollow(false);
            followStatusDTO.setStatus(false);
            followStatusDTO.setId(0L);
        } else {
            Follow follow = followList.get(0);
            if (follow.getStatus() == 1) {
                followStatusDTO.setFollow(true);
                followStatusDTO.setStatus(true);
                followStatusDTO.setId(follow.getId());
            }
            if (follow.getStatus() == 2) {
                followStatusDTO.setFollow(true);
                followStatusDTO.setStatus(false);
                followStatusDTO.setId(follow.getId());
            }
        }
        return followStatusDTO;
    }

    /**
     * @author: 小case
     * @date: 2020/5/28 10:36
     * @description: 根据FollowStatusDTO的状态进行插入或更新follow
     * @Param: followDTO
     * @Param: followStatusDTO
     * @return: Long
     */
    public Long addOrUpdateFollow(FollowDTO followDTO, FollowStatusDTO followStatusDTO) {

        Long followId;

        // 如果未存在收藏记录，进行新增收藏记录
        if (!followStatusDTO.getFollow()) {
            Follow follow = new Follow();
            setFollow(follow, followDTO);
            follow.setGmtCreate(new Date());
            followMapper.insert(follow);

            followId = follow.getId();
        } else {
            Follow follow = followMapper.selectByPrimaryKey(followStatusDTO.getId());
            setFollow(follow, followDTO);
            follow.setGmtModified(new Date());
            followMapper.updateByPrimaryKey(follow);
            followId = follow.getId();
        }

        return followId;
    }

    /**
     * @author: 小case
     * @date: 2020/6/9 12:10
     * @description: 对follow进行赋值
     * @Param: follow
     * @Param: followDTO
     * @return: void
     */
    private void setFollow(Follow follow, FollowDTO followDTO) {
        follow.setUserId(followDTO.getUserId());
        follow.setCompanyId(followDTO.getCompanyId());
        follow.setCompanyName(followDTO.getCompanyName());
        follow.setCompanyCover(followDTO.getCompanyCover());
        follow.setCompanyProvince(followDTO.getCompanyProvince());
        follow.setCompanyCity(followDTO.getCompanyCity());
        follow.setCompanyDistrict(followDTO.getCompanyDistrict());
        follow.setCompanyAddress(followDTO.getCompanyAddress());
        follow.setStatus(1);
    }

    /**
     * @author: 小case
     * @date: 2020/5/28 11:37
     * @description: 根据followId更新follow状态
     * @Param: followId
     * @return: void
     */
    public void deleteFollow(Long followId) {

        Follow follow = followMapper.selectByPrimaryKey(followId);
        follow.setStatus(2);
        follow.setGmtModified(new Date());

        followMapper.updateByPrimaryKey(follow);
    }

    /**
     * @author: 小case
     * @date: 2020/6/9 12:06
     * @description: 根据商家类别查询所有商家信息并通过与当前位置的距离进行升序排列
     * @Param: companyQueryDTO
     * @return: Map<String,Object>
     */
    public Map<String, Object> selectCompanyByBussinessTypeId(CompanyQueryDTO companyQueryDTO) {

        // 根据状态查询商家
        List<CompanyMessageDTO> companyMessageDTOList = companyExpandMapper.selectByLocationWithBussinessTypeId(companyQueryDTO);

        // 将商家列表与当前位置进行距离计算并升序返回
        Map<String, Object> map = setCompanyMessageDTOListByDistance(companyQueryDTO, companyMessageDTOList);

        return map;
    }

    /**
     * @author: 小case
     * @date: 2020/6/9 12:06
     * @description: 根据输入信息通过商家名字和电话进行模糊查询,并将查询到的商家列表与当前位置进行距离计算
     * @Param: companyQueryDTO
     * @return: Map<String,Object>
     */
    public Map<String, Object> selectCompanyByNameOrTel(CompanyQueryDTO companyQueryDTO) {

        List<CompanyMessageDTO> companyMessageDTOList = companyExpandMapper.selectCompanyByNameOrTel(companyQueryDTO);

//        将商家列表与当前位置信息进行距离计算并升序返回
        Map<String, Object> map = setCompanyMessageDTOListByDistance(companyQueryDTO, companyMessageDTOList);

        return map;
    }

    /**
     * @author: 小case
     * @date: 2020/6/9 12:07
     * @description: 根据当前用户ID查询其收藏列表并根据状态返回
     * @Param: userId
     * @return: Map<String,Object>
     */
    public Map<String, Object> selectFollowByUserId(Long userId) {

        FollowExample followExample = new FollowExample();
        followExample.createCriteria().andUserIdEqualTo(userId).andStatusEqualTo(1);
        List<Follow> followList = followMapper.selectByExample(followExample);

        Map<String, Object> map = resultService.mapPutWithList("pageList", followList);

        return map;
    }
}
