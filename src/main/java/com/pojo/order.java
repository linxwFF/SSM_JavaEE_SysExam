package com.pojo;

public class order {
    private Integer id;

    private Integer userId;

    private Integer state;

    public order(Integer id, Integer userId, Integer state) {
        this.id = id;
        this.userId = userId;
        this.state = state;
    }

    public order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}