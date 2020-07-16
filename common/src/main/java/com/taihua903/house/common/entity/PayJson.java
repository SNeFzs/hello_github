package com.taihua903.house.common.entity;

import lombok.Data;

@Data
public class PayJson {
    private String requestId;
    private String goodsName;
    private String paymentAmount;
    private String paymentName;
}
