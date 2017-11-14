package com.pojo;

public class resource {
    private Integer id;

    private String name;

    private String desc;

    private String resourceUrl;

    public resource(Integer id, String name, String desc, String resourceUrl) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.resourceUrl = resourceUrl;
    }

    public resource() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }
}