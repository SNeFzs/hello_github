package com.taihua903.house.common.entity;

import java.util.Date;

public class PaymentRecord {
    private Integer id;

    private String requestId;

    private String paymentName;

    private Date paymentTime;

    private Long paymentAmount;

    private String goodsName;

    private Date createTime;

    private Date updateTime;

    public PaymentRecord(Integer id, String requestId, String paymentName, Date paymentTime, Long paymentAmount, String goodsName, Date createTime, Date updateTime) {
        this.id = id;
        this.requestId = requestId;
        this.paymentName = paymentName;
        this.paymentTime = paymentTime;
        this.paymentAmount = paymentAmount;
        this.goodsName = goodsName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public PaymentRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName == null ? null : paymentName.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Long getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
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
}