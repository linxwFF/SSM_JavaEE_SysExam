package com.dao;

import com.pojo.shop_cart_item;

public interface shop_cart_itemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shop_cart_item record);

    int insertSelective(shop_cart_item record);

    shop_cart_item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shop_cart_item record);

    int updateByPrimaryKey(shop_cart_item record);
}