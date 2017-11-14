package com.pojo;

import java.util.Date;

public class user {
    private Integer id;

    private String accout;

    private String password;

    private String question;

    private String answer;

    private String userImg;

    private String realName;

    private String tel;

    private String identitynumber;

    private String address;

    private String email;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    public user(Integer id, String accout, String password, String question, String answer, String userImg, String realName, String tel, String identitynumber, String address, String email, Date deleteTime, Date createTime, Date updateTime) {
        this.id = id;
        this.accout = accout;
        this.password = password;
        this.question = question;
        this.answer = answer;
        this.userImg = userImg;
        this.realName = realName;
        this.tel = tel;
        this.identitynumber = identitynumber;
        this.address = address;
        this.email = email;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public user() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout == null ? null : accout.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getIdentitynumber() {
        return identitynumber;
    }

    public void setIdentitynumber(String identitynumber) {
        this.identitynumber = identitynumber == null ? null : identitynumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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