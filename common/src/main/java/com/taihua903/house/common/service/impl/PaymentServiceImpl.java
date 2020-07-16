package com.taihua903.house.common.service.impl;

import com.taihua903.house.common.entity.PayJson;
import com.taihua903.house.common.service.PaymentService;
import com.taihua903.house.common.util.number.NumberUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public boolean checkRequest(PayJson payJson) {

        if (StringUtils.isEmpty(payJson.getRequestId()) ||
                StringUtils.isEmpty(payJson.getPaymentAmount())) {
            return false;
        }

        return NumberUtils.isNumber(payJson.getPaymentAmount());
    }
}
