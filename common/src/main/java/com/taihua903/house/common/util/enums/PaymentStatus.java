package com.taihua903.house.common.util.enums;

public enum PaymentStatus {

    PAY_SUCCESS("000","记录成功"),
    PAY_FAILED("500","记录失败");


    private String code;
    private String description;

    PaymentStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
