package com.oyt.entity;

import java.math.BigDecimal;

public class House {
    private Integer h_id;

    private String h_photo;

    private String h_title;

    private BigDecimal h_price;

    private String h_number;

    private Integer h_uid;

    private String h_address;

    private Double h_acreage;

    private String h_room;

    private String h_configure;

    private String remarks;

    public Integer getH_id() {
        return h_id;
    }

    public void setH_id(Integer h_id) {
        this.h_id = h_id;
    }

    public String getH_photo() {
        return h_photo;
    }

    public void setH_photo(String h_photo) {
        this.h_photo = h_photo == null ? null : h_photo.trim();
    }

    public String getH_title() {
        return h_title;
    }

    public void setH_title(String h_title) {
        this.h_title = h_title == null ? null : h_title.trim();
    }

    public BigDecimal getH_price() {
        return h_price;
    }

    public void setH_price(BigDecimal h_price) {
        this.h_price = h_price;
    }

    public String getH_number() {
        return h_number;
    }

    public void setH_number(String h_number) {
        this.h_number = h_number == null ? null : h_number.trim();
    }

    public Integer getH_uid() {
        return h_uid;
    }

    public void setH_uid(Integer h_uid) {
        this.h_uid = h_uid;
    }

    public String getH_address() {
        return h_address;
    }

    public void setH_address(String h_address) {
        this.h_address = h_address == null ? null : h_address.trim();
    }

    public Double getH_acreage() {
        return h_acreage;
    }

    public void setH_acreage(Double h_acreage) {
        this.h_acreage = h_acreage;
    }

    public String getH_room() {
        return h_room;
    }

    public void setH_room(String h_room) {
        this.h_room = h_room == null ? null : h_room.trim();
    }

    public String getH_configure() {
        return h_configure;
    }

    public void setH_configure(String h_configure) {
        this.h_configure = h_configure == null ? null : h_configure.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}