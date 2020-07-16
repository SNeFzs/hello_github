package com.taihua903.house.common.entity;

import com.taihua903.house.common.util.enums.PaymentStatus;
import lombok.Data;

@Data
public class Result<T> {
    private String requestId;
    private String responseCode;
    private String responseMsg;
    private T responseData;

    public static Result error(String requestId, PaymentStatus paymentStatus) {
        Result result = new Result();
        result.requestId = requestId;
        result.setResponseCode(paymentStatus.getCode());
        result.setResponseMsg(paymentStatus.getDescription());
        return result;
    }
    public static Result success(String requestId, PaymentStatus paymentStatus) {
        Result result = new Result();
        result.requestId = requestId;
        result.setResponseCode(paymentStatus.getCode());
        result.setResponseMsg(paymentStatus.getDescription());
        return result;
    }
}
