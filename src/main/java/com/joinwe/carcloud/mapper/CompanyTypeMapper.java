package com.joinwe.carcloud.mapper;

import com.joinwe.carcloud.model.CompanyType;
import com.joinwe.carcloud.model.CompanyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CompanyTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    long countByExample(CompanyTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int deleteByExample(CompanyTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int insert(CompanyType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int insertSelective(CompanyType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<CompanyType> selectByExampleWithRowbounds(CompanyTypeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    List<CompanyType> selectByExample(CompanyTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    CompanyType selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExampleSelective(@Param("record") CompanyType record, @Param("example") CompanyTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByExample(@Param("record") CompanyType record, @Param("example") CompanyTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKeySelective(CompanyType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_type
     *
     * @mbg.generated Tue Jun 23 19:13:26 CST 2020
     */
    int updateByPrimaryKey(CompanyType record);
}