package com.oyt.entity;

public class Users {
    private Integer u_id;

    private String u_username;

    private String u_password;

    private String u_sex;

    private Integer u_age;

    private String u_phone;

    private String u_realname;

    private String u_idcard;

    private String u_address;

    private Integer u_level;

    private String remarks;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username == null ? null : u_username.trim();
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password == null ? null : u_password.trim();
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex == null ? null : u_sex.trim();
    }

    public Integer getU_age() {
        return u_age;
    }

    public void setU_age(Integer u_age) {
        this.u_age = u_age;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone == null ? null : u_phone.trim();
    }

    public String getU_realname() {
        return u_realname;
    }

    public void setU_realname(String u_realname) {
        this.u_realname = u_realname == null ? null : u_realname.trim();
    }

    public String getU_idcard() {
        return u_idcard;
    }

    public void setU_idcard(String u_idcard) {
        this.u_idcard = u_idcard == null ? null : u_idcard.trim();
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address == null ? null : u_address.trim();
    }

    public Integer getU_level() {
        return u_level;
    }

    public void setU_level(Integer u_level) {
        this.u_level = u_level;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}