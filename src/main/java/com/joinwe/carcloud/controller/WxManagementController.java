package com.joinwe.carcloud.controller;

import com.joinwe.carcloud.dto.ResultDTO;
import com.joinwe.carcloud.model.Operation;
import com.joinwe.carcloud.service.ManagementService;
import com.joinwe.carcloud.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 小case
 * created on 2020/5/20 9:56
 */
@RestController
@RequestMapping("/wx")
public class WxManagementController {

    @Autowired
    private ManagementService managementService;

    @Autowired
    private PictureService pictureService;

    /**
     *
     * getNotice 获取资讯
     *
     * @author: 小case
     * @date: 2020/6/16 15:43
     * @param
     * @return: Object
     */
    @GetMapping("/mine/getNotice")
    public Object getNotice(){

        Map<String,Object> map = managementService.selectNotice();

        return ResultDTO.okOf(map);
    }

    /**
     *
     * getOperation 获取资讯相关信息
     *
     * @author: 小case
     * @date: 2020/6/16 15:43
     * @param
     * @return: Object
     */
    @GetMapping("/getOperation")
    public Object getOperation(){

        Operation operation = managementService.selectOperation();

        return ResultDTO.okOf(operation);
    }

    /**
     *
     * getArticlePicture 获取资讯图片
     *
     * @author: 小case
     * @date: 2020/6/16 15:43
     * @param
     * @return: Object
     */
    @GetMapping("/article/getArticlePicture")
    public Object getArticlePicture(){

        Map<String,Object> map = pictureService.selectByPictureLocation();

        return ResultDTO.okOf(map);
    }

    /**
     *
     * getHotArticle by
     *
     * @author: 小case
     * @date: 2020/6/16 15:44
     * @param
     * @return: Object
     */
    @GetMapping("/article/getArticleByArticleType")
    public Object getHotArticle(){

        Map<String,Object> map = managementService.selectArticleByType();

        return ResultDTO.okOf(map);
    }

    /**
     *
     * getArticleDetail 根据资讯Id获取资讯详情
     *
     * @author: 小case
     * @date: 2020/6/16 15:44
     * @param newsId
     * @return: Object
     */
    @GetMapping("/article/getArticleDetail/{newsId}")
    public Object getArticleDetail(@PathVariable(name = "newsId")Long newsId){

        Map<String,Object> map = managementService.selectArticleById(newsId);

        return ResultDTO.okOf(map);
    }

}
