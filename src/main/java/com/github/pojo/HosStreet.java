package com.github.pojo;

import java.io.Serializable;

/**
 * 街道
 */
public class HosStreet implements Serializable {
    private Integer SID;//街道id
    private String sName;//街道名称
    private Integer sDID;//区县id

    public HosStreet() {
    }

    public HosStreet(Integer SID, String sName, Integer sDID) {
        this.SID = SID;
        this.sName = sName;
        this.sDID = sDID;
    }

    public void setSID(Integer SID) {
        this.SID = SID;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsDID(Integer sDID) {
        this.sDID = sDID;
    }

    public Integer getSID() {
        return SID;
    }

    public String getsName() {
        return sName;
    }

    public Integer getsDID() {
        return sDID;
    }
}
