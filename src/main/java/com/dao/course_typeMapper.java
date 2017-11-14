package com.dao;

import com.pojo.course_type;

public interface course_typeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(course_type record);

    int insertSelective(course_type record);

    course_type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(course_type record);

    int updateByPrimaryKey(course_type record);
}