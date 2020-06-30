package com.joinwe.carcloud.model;

import java.util.Date;

public class Operation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.tel
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long creatorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long editorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Boolean isLocked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private Long version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.id
     *
     * @return the value of operation.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.id
     *
     * @param id the value for operation.id
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.tel
     *
     * @return the value of operation.tel
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.tel
     *
     * @param tel the value for operation.tel
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.gmt_create
     *
     * @return the value of operation.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.gmt_create
     *
     * @param gmtCreate the value for operation.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.creatorid
     *
     * @return the value of operation.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getCreatorid() {
        return creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.creatorid
     *
     * @param creatorid the value for operation.creatorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setCreatorid(Long creatorid) {
        this.creatorid = creatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.gmt_modified
     *
     * @return the value of operation.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.gmt_modified
     *
     * @param gmtModified the value for operation.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.editorid
     *
     * @return the value of operation.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getEditorid() {
        return editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.editorid
     *
     * @param editorid the value for operation.editorid
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setEditorid(Long editorid) {
        this.editorid = editorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.is_deleted
     *
     * @return the value of operation.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.is_deleted
     *
     * @param isDeleted the value for operation.is_deleted
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.is_locked
     *
     * @return the value of operation.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.is_locked
     *
     * @param isLocked the value for operation.is_locked
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation.version
     *
     * @return the value of operation.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operation.version
     *
     * @param version the value for operation.version
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}