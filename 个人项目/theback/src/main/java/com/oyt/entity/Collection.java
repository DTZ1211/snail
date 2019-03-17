package com.oyt.entity;

public class Collection {
    private Integer co_id;

    private Integer co_uid;

    private Integer co_hnumber;

    private String remarks;

    public Integer getCo_id() {
        return co_id;
    }

    public void setCo_id(Integer co_id) {
        this.co_id = co_id;
    }

    public Integer getCo_uid() {
        return co_uid;
    }

    public void setCo_uid(Integer co_uid) {
        this.co_uid = co_uid;
    }

    public Integer getCo_hnumber() {
        return co_hnumber;
    }

    public void setCo_hnumber(Integer co_hnumber) {
        this.co_hnumber = co_hnumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}