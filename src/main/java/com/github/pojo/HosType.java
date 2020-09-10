package com.github.pojo;

import java.io.Serializable;

/**
 * 房屋类型
 */
public class HosType implements Serializable {
    private Integer hTID;//房屋类型编号
    private String hName;//房屋类型名称

    public HosType() {
    }

    public HosType(Integer hTID, String hName) {
        this.hTID = hTID;
        this.hName = hName;
    }

    public Integer gethTID() {
        return hTID;
    }

    public void sethTID(Integer hTID) {
        this.hTID = hTID;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }
}
