package com.dao;

import com.pojo.order;

public interface orderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(order record);

    int insertSelective(order record);

    order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(order record);

    int updateByPrimaryKey(order record);
}