package com.atguigu.atcrowdfunding.common.bean;

import java.io.Serializable;

public class RolePermission implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer roleid;

    private Integer permissionid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }
}