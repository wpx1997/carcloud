package com.joinwe.carcloud.mapper;

import com.joinwe.carcloud.model.AuthItemIndex;
import com.joinwe.carcloud.model.AuthItemIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AuthItemIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    long countByExample(AuthItemIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int deleteByExample(AuthItemIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int insert(AuthItemIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int insertSelective(AuthItemIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<AuthItemIndex> selectByExampleWithBLOBsWithRowbounds(AuthItemIndexExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<AuthItemIndex> selectByExampleWithBLOBs(AuthItemIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<AuthItemIndex> selectByExampleWithRowbounds(AuthItemIndexExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<AuthItemIndex> selectByExample(AuthItemIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    AuthItemIndex selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") AuthItemIndex record, @Param("example") AuthItemIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") AuthItemIndex record, @Param("example") AuthItemIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExample(@Param("record") AuthItemIndex record, @Param("example") AuthItemIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKeySelective(AuthItemIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(AuthItemIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authitem_index
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKey(AuthItemIndex record);
}