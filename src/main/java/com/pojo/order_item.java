package com.pojo;

import java.util.Date;

public class order_item {
    private Integer id;

    private Integer orderId;

    private String name;

    private Long price;

    private Integer quantity;

    private Long total;

    private Date endTime;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    public order_item(Integer id, Integer orderId, String name, Long price, Integer quantity, Long total, Date endTime, Date deleteTime, Date createTime, Date updateTime) {
        this.id = id;
        this.orderId = orderId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.endTime = endTime;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public order_item() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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