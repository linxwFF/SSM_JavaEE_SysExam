package com.dao;

import com.pojo.answer;

public interface answerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(answer record);

    int insertSelective(answer record);

    answer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(answer record);

    int updateByPrimaryKey(answer record);
}