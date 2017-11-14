package com.pojo;

import java.util.Date;

public class article {
    private Integer id;

    private Integer userId;

    private String title;

    private String author;

    private Integer type;

    private String loadurl;

    private String tag;

    private String decoration;

    private String state;

    private String content;

    private Date deleteTime;

    private Date createTime;

    private Date updateTime;

    public article(Integer id, Integer userId, String title, String author, Integer type, String loadurl, String tag, String decoration, String state, String content, Date deleteTime, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.author = author;
        this.type = type;
        this.loadurl = loadurl;
        this.tag = tag;
        this.decoration = decoration;
        this.state = state;
        this.content = content;
        this.deleteTime = deleteTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public article() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLoadurl() {
        return loadurl;
    }

    public void setLoadurl(String loadurl) {
        this.loadurl = loadurl == null ? null : loadurl.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration == null ? null : decoration.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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