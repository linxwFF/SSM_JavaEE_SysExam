package com.pojo;

import java.util.Date;

public class shop_cart_item {
    private Integer id;

    private Integer shopCartId;

    private Integer chapterId;

    private Long price;

    private Integer quantity;

    private String remarks;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    public shop_cart_item(Integer id, Integer shopCartId, Integer chapterId, Long price, Integer quantity, String remarks, Date deleteTime, Date createTime, Date updateTime) {
        this.id = id;
        this.shopCartId = shopCartId;
        this.chapterId = chapterId;
        this.price = price;
        this.quantity = quantity;
        this.remarks = remarks;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public shop_cart_item() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopCartId() {
        return shopCartId;
    }

    public void setShopCartId(Integer shopCartId) {
        this.shopCartId = shopCartId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}