package com.dao;

import com.pojo.exam;

public interface examMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(exam record);

    int insertSelective(exam record);

    exam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(exam record);

    int updateByPrimaryKey(exam record);
}