package com.july.mapper;

import com.july.po.TBloger;
import com.july.po.TBlogerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBlogerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    long countByExample(TBlogerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    int deleteByExample(TBlogerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    int insert(TBloger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    int insertSelective(TBloger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    List<TBloger> selectByExample(TBlogerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    TBloger selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") TBloger record, @Param("example") TBlogerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    int updateByExample(@Param("record") TBloger record, @Param("example") TBlogerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    int updateByPrimaryKeySelective(TBloger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bloger
     *
     * @mbg.generated Fri Sep 13 16:38:56 CST 2019
     */
    int updateByPrimaryKey(TBloger record);
}