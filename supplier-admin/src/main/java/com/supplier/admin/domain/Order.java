package com.supplier.admin.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String oId;

    private String mId;

    private String oStatus;

    private Date createTime;

    private Date payTime;

    private String payType;

    private BigDecimal totalPrice;

    private BigDecimal productPrice;

    private BigDecimal freight;

    private Float totalWeight;

    private Integer totalNum;

    private String logisticsSn;

    private String ogisticsType;

    private Date deliveryTime;

    private Date confimReciveTime;

    private String closeReason;

    private Date closeTime;

    private Date cancelTime;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getoStatus() {
        return oStatus;
    }

    public void setoStatus(String oStatus) {
        this.oStatus = oStatus == null ? null : oStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public Float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public String getLogisticsSn() {
        return logisticsSn;
    }

    public void setLogisticsSn(String logisticsSn) {
        this.logisticsSn = logisticsSn == null ? null : logisticsSn.trim();
    }

    public String getOgisticsType() {
        return ogisticsType;
    }

    public void setOgisticsType(String ogisticsType) {
        this.ogisticsType = ogisticsType == null ? null : ogisticsType.trim();
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getConfimReciveTime() {
        return confimReciveTime;
    }

    public void setConfimReciveTime(Date confimReciveTime) {
        this.confimReciveTime = confimReciveTime;
    }

    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason == null ? null : closeReason.trim();
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }
}