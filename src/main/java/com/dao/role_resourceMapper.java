package com.dao;

import com.pojo.role_resource;

public interface role_resourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(role_resource record);

    int insertSelective(role_resource record);

    role_resource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(role_resource record);

    int updateByPrimaryKey(role_resource record);
}