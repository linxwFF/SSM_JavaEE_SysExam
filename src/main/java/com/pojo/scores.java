package com.pojo;

import java.util.Date;

public class scores {
    private Integer id;

    private Integer userId;

    private Integer examId;

    private Integer totalNum;

    private Integer rightNum;

    private Integer errorNum;

    private String answerRecords;

    private Float score;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    public scores(Integer id, Integer userId, Integer examId, Integer totalNum, Integer rightNum, Integer errorNum, String answerRecords, Float score, Date deleteTime, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.examId = examId;
        this.totalNum = totalNum;
        this.rightNum = rightNum;
        this.errorNum = errorNum;
        this.answerRecords = answerRecords;
        this.score = score;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public scores() {
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

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getRightNum() {
        return rightNum;
    }

    public void setRightNum(Integer rightNum) {
        this.rightNum = rightNum;
    }

    public Integer getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    public String getAnswerRecords() {
        return answerRecords;
    }

    public void setAnswerRecords(String answerRecords) {
        this.answerRecords = answerRecords == null ? null : answerRecords.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
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