package com.example.demo.dao;

import com.example.demo.domain.TCar;

import java.util.List;

public interface TCarDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car
     *
     * @mbg.generated
     */
    int insert(TCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car
     *
     * @mbg.generated
     */
    int insertSelective(TCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car
     *
     * @mbg.generated
     */
    TCar selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TCar record);
    List<TCar> selectAll();
}