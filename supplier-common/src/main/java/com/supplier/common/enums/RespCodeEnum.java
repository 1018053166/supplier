package com.supplier.common.enums;

/**
 * 返回状态吗
 */
public enum RespCodeEnum {

    SUCCESS("200", "success"),
    ERROR("500", "error");



    //get set

    private String code;

    private String value;

    RespCodeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
