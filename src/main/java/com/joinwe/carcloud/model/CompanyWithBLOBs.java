package com.joinwe.carcloud.model;

public class CompanyWithBLOBs extends Company {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.picture_list
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String pictureList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.service
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String service;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.description
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.picture_list
     *
     * @return the value of company.picture_list
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getPictureList() {
        return pictureList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.picture_list
     *
     * @param pictureList the value for company.picture_list
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setPictureList(String pictureList) {
        this.pictureList = pictureList == null ? null : pictureList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.service
     *
     * @return the value of company.service
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getService() {
        return service;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.service
     *
     * @param service the value for company.service
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.description
     *
     * @return the value of company.description
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.description
     *
     * @param description the value for company.description
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}