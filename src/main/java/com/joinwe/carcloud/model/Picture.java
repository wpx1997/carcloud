package com.joinwe.carcloud.model;

import java.util.Date;

public class Picture {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.name
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.location
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Integer location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.skiptype
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Integer skiptype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.skiptargetid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Long skiptargetid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.skiptarget
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private String skiptarget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.url
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Long creatorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Long editorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Boolean isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Boolean isLocked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.version
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Long version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.id
     *
     * @return the value of picture.id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.id
     *
     * @param id the value for picture.id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.name
     *
     * @return the value of picture.name
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.name
     *
     * @param name the value for picture.name
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.location
     *
     * @return the value of picture.location
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.location
     *
     * @param location the value for picture.location
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.skiptype
     *
     * @return the value of picture.skiptype
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Integer getSkiptype() {
        return skiptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.skiptype
     *
     * @param skiptype the value for picture.skiptype
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setSkiptype(Integer skiptype) {
        this.skiptype = skiptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.skiptargetid
     *
     * @return the value of picture.skiptargetid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Long getSkiptargetid() {
        return skiptargetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.skiptargetid
     *
     * @param skiptargetid the value for picture.skiptargetid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setSkiptargetid(Long skiptargetid) {
        this.skiptargetid = skiptargetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.skiptarget
     *
     * @return the value of picture.skiptarget
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public String getSkiptarget() {
        return skiptarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.skiptarget
     *
     * @param skiptarget the value for picture.skiptarget
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setSkiptarget(String skiptarget) {
        this.skiptarget = skiptarget == null ? null : skiptarget.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.url
     *
     * @return the value of picture.url
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.url
     *
     * @param url the value for picture.url
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.gmt_create
     *
     * @return the value of picture.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.gmt_create
     *
     * @param gmtCreate the value for picture.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.creatorid
     *
     * @return the value of picture.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Long getCreatorid() {
        return creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.creatorid
     *
     * @param creatorid the value for picture.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setCreatorid(Long creatorid) {
        this.creatorid = creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.gmt_modified
     *
     * @return the value of picture.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.gmt_modified
     *
     * @param gmtModified the value for picture.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.editorid
     *
     * @return the value of picture.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Long getEditorid() {
        return editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.editorid
     *
     * @param editorid the value for picture.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setEditorid(Long editorid) {
        this.editorid = editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.is_deleted
     *
     * @return the value of picture.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.is_deleted
     *
     * @param isDeleted the value for picture.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.is_locked
     *
     * @return the value of picture.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.is_locked
     *
     * @param isLocked the value for picture.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.version
     *
     * @return the value of picture.version
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.version
     *
     * @param version the value for picture.version
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}