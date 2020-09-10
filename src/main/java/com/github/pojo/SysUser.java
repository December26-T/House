package com.github.pojo;

import java.io.Serializable;

/**
 * 用户类
 */
public class SysUser implements Serializable {
    private Integer UID;//用户id
    private String uName;//用户名
    private String uPassword;//密码

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public SysUser(Integer UID, String uName, String uPassword) {
        this.UID = UID;
        this.uName = uName;
        this.uPassword = uPassword;
    }

    public SysUser() {
    }
}
