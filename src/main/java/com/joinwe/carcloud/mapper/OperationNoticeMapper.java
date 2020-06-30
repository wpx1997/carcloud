package com.joinwe.carcloud.mapper;

import com.joinwe.carcloud.model.OperationNotice;
import com.joinwe.carcloud.model.OperationNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OperationNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    long countByExample(OperationNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int deleteByExample(OperationNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int insert(OperationNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int insertSelective(OperationNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<OperationNotice> selectByExampleWithBLOBsWithRowbounds(OperationNoticeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<OperationNotice> selectByExampleWithBLOBs(OperationNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<OperationNotice> selectByExampleWithRowbounds(OperationNoticeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<OperationNotice> selectByExample(OperationNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    OperationNotice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") OperationNotice record, @Param("example") OperationNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") OperationNotice record, @Param("example") OperationNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExample(@Param("record") OperationNotice record, @Param("example") OperationNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKeySelective(OperationNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(OperationNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_notice
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKey(OperationNotice record);
}