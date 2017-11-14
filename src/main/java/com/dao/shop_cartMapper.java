package com.dao;

import com.pojo.shop_cart;

public interface shop_cartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shop_cart record);

    int insertSelective(shop_cart record);

    shop_cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shop_cart record);

    int updateByPrimaryKey(shop_cart record);
}