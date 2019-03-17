package com.oyt.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Invoice {
    private Integer i_id;

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date i_date;

    private Integer i_hnumber;

    private Integer i_usid;

    private Integer i_ubid;

    private Integer i_onumber;

    private String remarks;

    public Integer getI_id() {
        return i_id;
    }

    public void setI_id(Integer i_id) {
        this.i_id = i_id;
    }

    public Date getI_date() {
        return i_date;
    }

    public void setI_date(Date i_date) {
        this.i_date = i_date;
    }

    public Integer getI_hnumber() {
        return i_hnumber;
    }

    public void setI_hnumber(Integer i_hnumber) {
        this.i_hnumber = i_hnumber;
    }

    public Integer getI_usid() {
        return i_usid;
    }

    public void setI_usid(Integer i_usid) {
        this.i_usid = i_usid;
    }

    public Integer getI_ubid() {
        return i_ubid;
    }

    public void setI_ubid(Integer i_ubid) {
        this.i_ubid = i_ubid;
    }

    public Integer getI_onumber() {
        return i_onumber;
    }

    public void setI_onumber(Integer i_onumber) {
        this.i_onumber = i_onumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}