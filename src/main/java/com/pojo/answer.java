package com.pojo;

import java.util.Date;

public class answer {
    private Integer id;

    private Integer userId;

    private Integer examId;

    private String answerRecords;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    private Date startTime;

    private Date endTime;

    private Date surplusTime;

    public answer(Integer id, Integer userId, Integer examId, String answerRecords, Date deleteTime, Date createTime, Date updateTime, Date startTime, Date endTime, Date surplusTime) {
        this.id = id;
        this.userId = userId;
        this.examId = examId;
        this.answerRecords = answerRecords;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.surplusTime = surplusTime;
    }

    public answer() {
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

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getAnswerRecords() {
        return answerRecords;
    }

    public void setAnswerRecords(String answerRecords) {
        this.answerRecords = answerRecords == null ? null : answerRecords.trim();
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getSurplusTime() {
        return surplusTime;
    }

    public void setSurplusTime(Date surplusTime) {
        this.surplusTime = surplusTime;
    }
}