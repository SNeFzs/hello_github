package com.taihua903.house.common.service;

import com.taihua903.house.common.entity.PayJson;

public interface PaymentService {
    boolean checkRequest(PayJson payJson);

}
