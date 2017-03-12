package com.supplier.admin.domain;

public class GoodSunit {
    private Integer guId;

    private String guCode;

    private String guGoodsUnit;

    public Integer getGuId() {
        return guId;
    }

    public void setGuId(Integer guId) {
        this.guId = guId;
    }

    public String getGuCode() {
        return guCode;
    }

    public void setGuCode(String guCode) {
        this.guCode = guCode == null ? null : guCode.trim();
    }

    public String getGuGoodsUnit() {
        return guGoodsUnit;
    }

    public void setGuGoodsUnit(String guGoodsUnit) {
        this.guGoodsUnit = guGoodsUnit == null ? null : guGoodsUnit.trim();
    }
}