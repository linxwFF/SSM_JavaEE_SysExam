package com.pojo;

import java.util.Date;

public class exam {
    private Integer id;

    private Integer userId;

    private Integer courseId;

    private Integer chapterId;

    private String examTitle;

    private Integer state;

    private String questions;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    public exam(Integer id, Integer userId, Integer courseId, Integer chapterId, String examTitle, Integer state, String questions, Date deleteTime, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
        this.chapterId = chapterId;
        this.examTitle = examTitle;
        this.state = state;
        this.questions = questions;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public exam() {
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

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle == null ? null : examTitle.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions == null ? null : questions.trim();
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