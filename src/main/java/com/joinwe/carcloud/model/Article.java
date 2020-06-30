package com.joinwe.carcloud.model;

import java.util.Date;

public class Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Integer articleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.is_stick
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean isStick;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.stick_order
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Integer stickOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.is_show
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean isShow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.cover
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String cover;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long creatorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long editorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean isLocked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.code
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_type
     *
     * @return the value of article.article_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Integer getArticleType() {
        return articleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_type
     *
     * @param articleType the value for article.article_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.is_stick
     *
     * @return the value of article.is_stick
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getIsStick() {
        return isStick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.is_stick
     *
     * @param isStick the value for article.is_stick
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setIsStick(Boolean isStick) {
        this.isStick = isStick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.stick_order
     *
     * @return the value of article.stick_order
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Integer getStickOrder() {
        return stickOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.stick_order
     *
     * @param stickOrder the value for article.stick_order
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setStickOrder(Integer stickOrder) {
        this.stickOrder = stickOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.is_show
     *
     * @return the value of article.is_show
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.is_show
     *
     * @param isShow the value for article.is_show
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.cover
     *
     * @return the value of article.cover
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.cover
     *
     * @param cover the value for article.cover
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.gmt_create
     *
     * @return the value of article.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.gmt_create
     *
     * @param gmtCreate the value for article.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.creatorid
     *
     * @return the value of article.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getCreatorid() {
        return creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.creatorid
     *
     * @param creatorid the value for article.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setCreatorid(Long creatorid) {
        this.creatorid = creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.gmt_modified
     *
     * @return the value of article.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.gmt_modified
     *
     * @param gmtModified the value for article.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.editorid
     *
     * @return the value of article.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getEditorid() {
        return editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.editorid
     *
     * @param editorid the value for article.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setEditorid(Long editorid) {
        this.editorid = editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.is_deleted
     *
     * @return the value of article.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.is_deleted
     *
     * @param isDeleted the value for article.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.is_locked
     *
     * @return the value of article.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.is_locked
     *
     * @param isLocked the value for article.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.version
     *
     * @return the value of article.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.version
     *
     * @param version the value for article.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.code
     *
     * @return the value of article.code
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.code
     *
     * @param code the value for article.code
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}