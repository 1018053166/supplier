package com.supplier.admin.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private String pid;

    private String pName;

    private String pCode;

    private String pSubtitle;

    private String pImage;

    private String typeId;

    private String subId;

    private String guId;

    private Float pNetWeight;

    private Float pGrossWeight;

    private BigDecimal pPrice;

    private BigDecimal pMarketPrice;

    private BigDecimal pCostPrice;

    private Integer pWeight;

    private String pStatus;

    private Integer pDeleted;

    private String pMemo;

    private Date createTime;

    private Date updateTime;

    private String pDetail;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode == null ? null : pCode.trim();
    }

    public String getpSubtitle() {
        return pSubtitle;
    }

    public void setpSubtitle(String pSubtitle) {
        this.pSubtitle = pSubtitle == null ? null : pSubtitle.trim();
    }

    public String getpImage() {
        return pImage;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage == null ? null : pImage.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId == null ? null : subId.trim();
    }

    public String getGuId() {
        return guId;
    }

    public void setGuId(String guId) {
        this.guId = guId == null ? null : guId.trim();
    }

    public Float getpNetWeight() {
        return pNetWeight;
    }

    public void setpNetWeight(Float pNetWeight) {
        this.pNetWeight = pNetWeight;
    }

    public Float getpGrossWeight() {
        return pGrossWeight;
    }

    public void setpGrossWeight(Float pGrossWeight) {
        this.pGrossWeight = pGrossWeight;
    }

    public BigDecimal getpPrice() {
        return pPrice;
    }

    public void setpPrice(BigDecimal pPrice) {
        this.pPrice = pPrice;
    }

    public BigDecimal getpMarketPrice() {
        return pMarketPrice;
    }

    public void setpMarketPrice(BigDecimal pMarketPrice) {
        this.pMarketPrice = pMarketPrice;
    }

    public BigDecimal getpCostPrice() {
        return pCostPrice;
    }

    public void setpCostPrice(BigDecimal pCostPrice) {
        this.pCostPrice = pCostPrice;
    }

    public Integer getpWeight() {
        return pWeight;
    }

    public void setpWeight(Integer pWeight) {
        this.pWeight = pWeight;
    }

    public String getpStatus() {
        return pStatus;
    }

    public void setpStatus(String pStatus) {
        this.pStatus = pStatus == null ? null : pStatus.trim();
    }

    public Integer getpDeleted() {
        return pDeleted;
    }

    public void setpDeleted(Integer pDeleted) {
        this.pDeleted = pDeleted;
    }

    public String getpMemo() {
        return pMemo;
    }

    public void setpMemo(String pMemo) {
        this.pMemo = pMemo == null ? null : pMemo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getpDetail() {
        return pDetail;
    }

    public void setpDetail(String pDetail) {
        this.pDetail = pDetail == null ? null : pDetail.trim();
    }
}