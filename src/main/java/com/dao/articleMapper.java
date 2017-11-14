package com.dao;

import com.pojo.article;

public interface articleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(article record);

    int insertSelective(article record);

    article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(article record);

    int updateByPrimaryKey(article record);
}