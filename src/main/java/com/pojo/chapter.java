package com.pojo;

import java.util.Date;

public class chapter {
    private Integer id;

    private Integer pId;

    private String courseTypeId;

    private String chapterName;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    public chapter(Integer id, Integer pId, String courseTypeId, String chapterName, Date deleteTime, Date createTime, Date updateTime) {
        this.id = id;
        this.pId = pId;
        this.courseTypeId = courseTypeId;
        this.chapterName = chapterName;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public chapter() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId == null ? null : courseTypeId.trim();
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
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