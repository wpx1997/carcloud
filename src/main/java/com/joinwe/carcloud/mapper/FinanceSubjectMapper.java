package com.joinwe.carcloud.mapper;

import com.joinwe.carcloud.model.FinanceSubject;
import com.joinwe.carcloud.model.FinanceSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FinanceSubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    long countByExample(FinanceSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int deleteByExample(FinanceSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int insert(FinanceSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int insertSelective(FinanceSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<FinanceSubject> selectByExampleWithRowbounds(FinanceSubjectExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<FinanceSubject> selectByExample(FinanceSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    FinanceSubject selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") FinanceSubject record, @Param("example") FinanceSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExample(@Param("record") FinanceSubject record, @Param("example") FinanceSubjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKeySelective(FinanceSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance_subject
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKey(FinanceSubject record);
}