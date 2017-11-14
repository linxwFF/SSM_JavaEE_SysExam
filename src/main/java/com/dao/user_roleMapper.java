package com.dao;

import com.pojo.user_role;

public interface user_roleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user_role record);

    int insertSelective(user_role record);

    user_role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user_role record);

    int updateByPrimaryKey(user_role record);
}