package com.supplier.admin.domain;

public class Area {
    private Integer aid;

    private String areaId;

    private String areaName;

    private String areaPid;

    private String areaZipcode;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAreaPid() {
        return areaPid;
    }

    public void setAreaPid(String areaPid) {
        this.areaPid = areaPid == null ? null : areaPid.trim();
    }

    public String getAreaZipcode() {
        return areaZipcode;
    }

    public void setAreaZipcode(String areaZipcode) {
        this.areaZipcode = areaZipcode == null ? null : areaZipcode.trim();
    }
}