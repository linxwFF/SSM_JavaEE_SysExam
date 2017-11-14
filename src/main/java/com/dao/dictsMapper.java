package com.dao;

import com.pojo.dicts;

public interface dictsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(dicts record);

    int insertSelective(dicts record);

    dicts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(dicts record);

    int updateByPrimaryKey(dicts record);
}