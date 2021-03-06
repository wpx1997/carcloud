package com.joinwe.carcloud.model;

public class WxUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.account_id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.name
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.token
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.avatar_url
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.open_id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private String openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.login_status
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Integer loginStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.type
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wx_user.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    private Long gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.id
     *
     * @return the value of wx_user.id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.id
     *
     * @param id the value for wx_user.id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.account_id
     *
     * @return the value of wx_user.account_id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.account_id
     *
     * @param accountId the value for wx_user.account_id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.name
     *
     * @return the value of wx_user.name
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.name
     *
     * @param name the value for wx_user.name
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.token
     *
     * @return the value of wx_user.token
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.token
     *
     * @param token the value for wx_user.token
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.avatar_url
     *
     * @return the value of wx_user.avatar_url
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.avatar_url
     *
     * @param avatarUrl the value for wx_user.avatar_url
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.open_id
     *
     * @return the value of wx_user.open_id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.open_id
     *
     * @param openId the value for wx_user.open_id
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.login_status
     *
     * @return the value of wx_user.login_status
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Integer getLoginStatus() {
        return loginStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.login_status
     *
     * @param loginStatus the value for wx_user.login_status
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.type
     *
     * @return the value of wx_user.type
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.type
     *
     * @param type the value for wx_user.type
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.gmt_create
     *
     * @return the value of wx_user.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.gmt_create
     *
     * @param gmtCreate the value for wx_user.gmt_create
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.gmt_modified
     *
     * @return the value of wx_user.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.gmt_modified
     *
     * @param gmtModified the value for wx_user.gmt_modified
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
}