package com.dao;

import com.pojo.questions;

public interface questionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(questions record);

    int insertSelective(questions record);

    questions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(questions record);

    int updateByPrimaryKeyWithBLOBs(questions record);

    int updateByPrimaryKey(questions record);
}