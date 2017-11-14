package com.pojo;

public class role_resource {
    private Integer id;

    private Integer code;

    private Integer resourceId;

    private Integer roleId;

    public role_resource(Integer id, Integer code, Integer resourceId, Integer roleId) {
        this.id = id;
        this.code = code;
        this.resourceId = resourceId;
        this.roleId = roleId;
    }

    public role_resource() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}