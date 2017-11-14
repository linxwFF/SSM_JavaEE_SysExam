package com.dao;

import com.pojo.chapter;

public interface chapterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(chapter record);

    int insertSelective(chapter record);

    chapter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(chapter record);

    int updateByPrimaryKey(chapter record);
}