package com.dao;

import com.pojo.resource;

public interface resourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(resource record);

    int insertSelective(resource record);

    resource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(resource record);

    int updateByPrimaryKey(resource record);
}