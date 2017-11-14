package com.dao;

import com.pojo.scores;

public interface scoresMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(scores record);

    int insertSelective(scores record);

    scores selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(scores record);

    int updateByPrimaryKey(scores record);
}