package com.joinwe.carcloud.controller;

import com.joinwe.carcloud.dto.FollowDTO;
import com.joinwe.carcloud.dto.FollowStatusDTO;
import com.joinwe.carcloud.dto.ResultDTO;
import com.joinwe.carcloud.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author 小case
 * created on 2020/5/18 15:29
 */
@RestController
@RequestMapping("/wx/company")
public class WxCompanyController {

    @Autowired
    private CompanyService companyService;

    /**
     * @author: 小case
     * @date: 2020/5/27
     * @description: 根据商家Id查询商家详情
     * @Param: companyId
     * @return: Object
     */
    @GetMapping("/getCompanyDetail/{companyId}")
    public Object getCompanyDetail(@PathVariable(name = "companyId") Long companyId){

        Map<String,Object> map = companyService.selectCompanyById(companyId);

        return ResultDTO.okOf(map);
    }

    /**
     * @author: 小case
     * @date: 2020/5/27
     * @description: 通过商家Id和用户Id判断收藏信息
     * @Param: userId
     * @Param: companyId
     * @return: Object
     */
    @GetMapping("/getMyFollow/{userId}/{companyId}")
    public Object getMyFollow(@PathVariable(name = "userId")Long userId,
                              @PathVariable(name = "companyId")Long companyId){

        FollowStatusDTO followStatusDTO = companyService.followStatus(userId,companyId);

        return ResultDTO.okOf(followStatusDTO);
    }

    /**
     * @author: 小case
     * @date: 2020/5/28
     * @description: 根据用户Id返回收藏列表
     * @Param: userId
     * @return: Object
     */
    @GetMapping("/getMyFollow/{userId}")
    public Object getMyFollowList(@PathVariable(name = "userId")Long userId){

        Map<String,Object> map = companyService.selectFollowByUserId(userId);

        return ResultDTO.okOf(map);
    }

    /**
     * @author: 小case
     * @date: 2020/5/28
     * @description: 点击收藏
     * @Param: followDTO
     * @return: Object
     */
    @ResponseBody
    @RequestMapping(value = "/addFollow",method = RequestMethod.POST)
    public Object addFollow(@RequestBody @Valid FollowDTO followDTO){

        // 查询是否存在收藏记录
        FollowStatusDTO followStatusDTO = companyService.followStatus(followDTO.getUserId(),followDTO.getCompanyId());

        // 对是否存在收藏记录进行处理
        Long followId = companyService.addOrUpdateFollow(followDTO,followStatusDTO);

        return ResultDTO.okOf(followId);
    }

    /**
     * @author: 小case
     * @date: 2020/6/9 11:56
     * @description: 取消收藏
     * @Param: followId
     * @return: Object
     */
    @GetMapping("/deleteFollow/{followId}")
    public Object deleteFollow(@PathVariable(name = "followId")Long followId){

        // 取消收藏处理
        companyService.deleteFollow(followId);

        return ResultDTO.okOf();
    }

}
