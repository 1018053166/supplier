package com.supplier.admin.domain;

import java.math.BigDecimal;

public class Freight {
    private Integer fId;

    private String fName;

    private String fCode;

    private BigDecimal fTotalFreight;

    private Float fKg;

    private Integer fUnit;

    private BigDecimal fPrice;

    private Integer fDefault;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode == null ? null : fCode.trim();
    }

    public BigDecimal getfTotalFreight() {
        return fTotalFreight;
    }

    public void setfTotalFreight(BigDecimal fTotalFreight) {
        this.fTotalFreight = fTotalFreight;
    }

    public Float getfKg() {
        return fKg;
    }

    public void setfKg(Float fKg) {
        this.fKg = fKg;
    }

    public Integer getfUnit() {
        return fUnit;
    }

    public void setfUnit(Integer fUnit) {
        this.fUnit = fUnit;
    }

    public BigDecimal getfPrice() {
        return fPrice;
    }

    public void setfPrice(BigDecimal fPrice) {
        this.fPrice = fPrice;
    }

    public Integer getfDefault() {
        return fDefault;
    }

    public void setfDefault(Integer fDefault) {
        this.fDefault = fDefault;
    }
}