package com.joinwe.carcloud.mapper;

import com.joinwe.carcloud.model.PermissionResourceMap;
import com.joinwe.carcloud.model.PermissionResourceMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PermissionResourceMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    long countByExample(PermissionResourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    int deleteByExample(PermissionResourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    int insert(PermissionResourceMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    int insertSelective(PermissionResourceMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    List<PermissionResourceMap> selectByExampleWithRowbounds(PermissionResourceMapExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    List<PermissionResourceMap> selectByExample(PermissionResourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    PermissionResourceMap selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") PermissionResourceMap record, @Param("example") PermissionResourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    int updateByExample(@Param("record") PermissionResourceMap record, @Param("example") PermissionResourceMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    int updateByPrimaryKeySelective(PermissionResourceMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionresource_map
     *
     * @mbg.generated Tue Jun 23 19:13:27 CST 2020
     */
    int updateByPrimaryKey(PermissionResourceMap record);
}