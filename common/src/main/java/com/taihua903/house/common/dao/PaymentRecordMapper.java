package com.taihua903.house.common.dao;

import com.taihua903.house.common.entity.PaymentRecord;

public interface PaymentRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentRecord record);

    int insertSelective(PaymentRecord record);

    PaymentRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentRecord record);

    int updateByPrimaryKey(PaymentRecord record);
}