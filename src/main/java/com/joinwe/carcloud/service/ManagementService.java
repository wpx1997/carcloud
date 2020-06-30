package com.joinwe.carcloud.service;

import com.joinwe.carcloud.mapper.OperationMapper;
import com.joinwe.carcloud.model.*;
import com.joinwe.carcloud.mapper.ArticleMapper;
import com.joinwe.carcloud.mapper.OperationNoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * created by 小case on 2020/5/19 16:29
 */
@Service
public class ManagementService {

    @Autowired
    private ResultService resultService;

    @Autowired
    private OperationMapper operationMapper;

    @Autowired
    private OperationNoticeMapper operationNoticeMapper;

    @Autowired
    private ArticleMapper articleMapper;

//    查询运营信息
    public Operation selectOperation() {

        Operation operation = operationMapper.selectByPrimaryKey(1L);

        return operation;
    }

//    查询公告
    public Map<String, Object> selectNotice() {

        OperationNoticeExample operationNoticeExample = new OperationNoticeExample();
        operationNoticeExample.createCriteria().andIsLockedEqualTo(false);
        List<OperationNotice> operationNoticeList = operationNoticeMapper.selectByExampleWithBLOBs(operationNoticeExample);

        Map<String,Object> map = resultService.mapPutWithList("pageList",operationNoticeList);

        return map;
    }

//    根据资讯类别查询并通过置顶情况进行返回
    public Map<String, Object> selectArticleByType() {

        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andIsShowEqualTo(true);
        articleExample.setOrderByClause("stick_order asc");
        List<Article> articleList = articleMapper.selectByExample(articleExample);
        Map<String,Object> map = resultService.mapPutWithList("articleList",articleList);

        return map;
    }

//    根据资讯ID查询资讯信息
    public Map<String, Object> selectArticleById(Long newsId) {

        Article article = articleMapper.selectByPrimaryKey(newsId);
        Map<String,Object> map = resultService.mapPutWithList("articleDetail",article);

        return map;
    }
}
