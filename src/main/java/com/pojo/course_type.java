package com.pojo;

import java.util.Date;

public class course_type {
    private Integer id;

    private Integer type;

    private String courseName;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    public course_type(Integer id, Integer type, String courseName, Date deleteTime, Date createTime, Date updateTime) {
        this.id = id;
        this.type = type;
        this.courseName = courseName;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public course_type() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
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