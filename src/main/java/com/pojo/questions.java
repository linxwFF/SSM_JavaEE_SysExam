package com.pojo;

import java.util.Date;

public class questions {
    private Integer id;

    private String chooseA;

    private String chooseB;

    private String chooseC;

    private String chooseD;

    private String chooseE;

    private String chooseF;

    private String chooseG;

    private String chooseRight;

    private String analysis;

    private Integer type;

    private Integer courseTypeId;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    private String imgUrl;

    private String subject;

    public questions(Integer id, String chooseA, String chooseB, String chooseC, String chooseD, String chooseE, String chooseF, String chooseG, String chooseRight, String analysis, Integer type, Integer courseTypeId, Date deleteTime, Date createTime, Date updateTime, String imgUrl, String subject) {
        this.id = id;
        this.chooseA = chooseA;
        this.chooseB = chooseB;
        this.chooseC = chooseC;
        this.chooseD = chooseD;
        this.chooseE = chooseE;
        this.chooseF = chooseF;
        this.chooseG = chooseG;
        this.chooseRight = chooseRight;
        this.analysis = analysis;
        this.type = type;
        this.courseTypeId = courseTypeId;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.imgUrl = imgUrl;
        this.subject = subject;
    }

    public questions() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChooseA() {
        return chooseA;
    }

    public void setChooseA(String chooseA) {
        this.chooseA = chooseA == null ? null : chooseA.trim();
    }

    public String getChooseB() {
        return chooseB;
    }

    public void setChooseB(String chooseB) {
        this.chooseB = chooseB == null ? null : chooseB.trim();
    }

    public String getChooseC() {
        return chooseC;
    }

    public void setChooseC(String chooseC) {
        this.chooseC = chooseC == null ? null : chooseC.trim();
    }

    public String getChooseD() {
        return chooseD;
    }

    public void setChooseD(String chooseD) {
        this.chooseD = chooseD == null ? null : chooseD.trim();
    }

    public String getChooseE() {
        return chooseE;
    }

    public void setChooseE(String chooseE) {
        this.chooseE = chooseE == null ? null : chooseE.trim();
    }

    public String getChooseF() {
        return chooseF;
    }

    public void setChooseF(String chooseF) {
        this.chooseF = chooseF == null ? null : chooseF.trim();
    }

    public String getChooseG() {
        return chooseG;
    }

    public void setChooseG(String chooseG) {
        this.chooseG = chooseG == null ? null : chooseG.trim();
    }

    public String getChooseRight() {
        return chooseRight;
    }

    public void setChooseRight(String chooseRight) {
        this.chooseRight = chooseRight == null ? null : chooseRight.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(Integer courseTypeId) {
        this.courseTypeId = courseTypeId;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }
}