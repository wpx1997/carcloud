package com.joinwe.carcloud.model;

import java.util.Date;

public class AuthItemIndex {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.rootid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String rootid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.parentid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.authitemname
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String authitemname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.authitemtype
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean authitemtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.biztype
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Integer biztype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long creatorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long editorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean isLocked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authitem_index.familypath
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String familypath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.id
     *
     * @return the value of authitem_index.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.id
     *
     * @param id the value for authitem_index.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.rootid
     *
     * @return the value of authitem_index.rootid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getRootid() {
        return rootid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.rootid
     *
     * @param rootid the value for authitem_index.rootid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setRootid(String rootid) {
        this.rootid = rootid == null ? null : rootid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.parentid
     *
     * @return the value of authitem_index.parentid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.parentid
     *
     * @param parentid the value for authitem_index.parentid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.authitemname
     *
     * @return the value of authitem_index.authitemname
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getAuthitemname() {
        return authitemname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.authitemname
     *
     * @param authitemname the value for authitem_index.authitemname
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setAuthitemname(String authitemname) {
        this.authitemname = authitemname == null ? null : authitemname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.authitemtype
     *
     * @return the value of authitem_index.authitemtype
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getAuthitemtype() {
        return authitemtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.authitemtype
     *
     * @param authitemtype the value for authitem_index.authitemtype
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setAuthitemtype(Boolean authitemtype) {
        this.authitemtype = authitemtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.biztype
     *
     * @return the value of authitem_index.biztype
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Integer getBiztype() {
        return biztype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.biztype
     *
     * @param biztype the value for authitem_index.biztype
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setBiztype(Integer biztype) {
        this.biztype = biztype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.gmt_create
     *
     * @return the value of authitem_index.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.gmt_create
     *
     * @param gmtCreate the value for authitem_index.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.creatorid
     *
     * @return the value of authitem_index.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getCreatorid() {
        return creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.creatorid
     *
     * @param creatorid the value for authitem_index.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setCreatorid(Long creatorid) {
        this.creatorid = creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.gmt_modified
     *
     * @return the value of authitem_index.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.gmt_modified
     *
     * @param gmtModified the value for authitem_index.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.editorid
     *
     * @return the value of authitem_index.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getEditorid() {
        return editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.editorid
     *
     * @param editorid the value for authitem_index.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setEditorid(Long editorid) {
        this.editorid = editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.is_deleted
     *
     * @return the value of authitem_index.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.is_deleted
     *
     * @param isDeleted the value for authitem_index.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.is_locked
     *
     * @return the value of authitem_index.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.is_locked
     *
     * @param isLocked the value for authitem_index.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.version
     *
     * @return the value of authitem_index.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.version
     *
     * @param version the value for authitem_index.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authitem_index.familypath
     *
     * @return the value of authitem_index.familypath
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getFamilypath() {
        return familypath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authitem_index.familypath
     *
     * @param familypath the value for authitem_index.familypath
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setFamilypath(String familypath) {
        this.familypath = familypath == null ? null : familypath.trim();
    }
}