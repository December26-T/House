package com.github.pojo;

import java.io.Serializable;

/**
 * 区县
 */
public class HosDistrict implements Serializable {
    private Integer DID;//区县id
    private String dName;//区县名称

    public HosDistrict() {
    }

    public HosDistrict(Integer DID, String dName) {
        this.DID = DID;
        this.dName = dName;
    }

    public Integer getDID() {
        return DID;
    }

    public void setDID(Integer DID) {
        this.DID = DID;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}
