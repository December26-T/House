package com.github.pojo;

import java.util.Date;

/**
 * 出租房屋
 */
public class HosHouse {
    private Integer hMID;//出租房屋编号
    private Integer UID;//用户编号
    private Integer SID;//街道编号
    private Integer hTID;//房屋类型
    private Double price;//价格
    private String topic;//标题
    private String contents;//内容
    private Date hTime;//时间
    private String copy;//复制

    public HosHouse(Integer hMID, Integer UID, Integer SID, Integer hTID, Double price, String topic, String contents, Date hTime, String copy) {
        this.hMID = hMID;
        this.UID = UID;
        this.SID = SID;
        this.hTID = hTID;
        this.price = price;
        this.topic = topic;
        this.contents = contents;
        this.hTime = hTime;
        this.copy = copy;
    }

    public HosHouse() {
    }

    public Integer gethMID() {
        return hMID;
    }

    public void sethMID(Integer hMID) {
        this.hMID = hMID;
    }

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public Integer getSID() {
        return SID;
    }

    public void setSID(Integer SID) {
        this.SID = SID;
    }

    public Integer gethTID() {
        return hTID;
    }

    public void sethTID(Integer hTID) {
        this.hTID = hTID;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date gethTime() {
        return hTime;
    }

    public void sethTime(Date hTime) {
        this.hTime = hTime;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }
}
