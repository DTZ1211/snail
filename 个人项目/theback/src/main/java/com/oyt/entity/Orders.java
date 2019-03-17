package com.oyt.entity;

public class Orders {
    private Integer o_id;

    private String o_number;

    private Integer o_hnumber;

    private Integer o_usid;

    private Integer o_ubid;

    private Integer o_state;

    private String remarks;

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public String getO_number() {
        return o_number;
    }

    public void setO_number(String o_number) {
        this.o_number = o_number == null ? null : o_number.trim();
    }

    public Integer getO_hnumber() {
        return o_hnumber;
    }

    public void setO_hnumber(Integer o_hnumber) {
        this.o_hnumber = o_hnumber;
    }

    public Integer getO_usid() {
        return o_usid;
    }

    public void setO_usid(Integer o_usid) {
        this.o_usid = o_usid;
    }

    public Integer getO_ubid() {
        return o_ubid;
    }

    public void setO_ubid(Integer o_ubid) {
        this.o_ubid = o_ubid;
    }

    public Integer getO_state() {
        return o_state;
    }

    public void setO_state(Integer o_state) {
        this.o_state = o_state;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}