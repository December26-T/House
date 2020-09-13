package com.github.pojo;

import java.io.Serializable;

/**
 * 房屋类型
 */
public class HosType implements Serializable {
    private Integer hTID;//房屋类型编号
    private String hTName;//房屋类型名称

    public Integer gethTID() {
        return hTID;
    }

    public void sethTID(Integer hTID) {
        this.hTID = hTID;
    }

    public String gethTName() {
        return hTName;
    }

    public void sethTName(String hTName) {
        this.hTName = hTName;
    }

    public HosType(Integer hTID, String hTName) {
        this.hTID = hTID;
        this.hTName = hTName;
    }
    public HosType() {

    }
}