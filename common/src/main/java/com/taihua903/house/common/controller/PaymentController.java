package com.taihua903.house.common.controller;

import com.taihua903.house.common.entity.PayJson;
import com.taihua903.house.common.entity.Result;
import com.taihua903.house.common.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @RequestMapping("buy")
    public Result<String> pay(@RequestBody PayJson payJson) {
        boolean flag = paymentService.checkRequest(payJson);
        return null;
    }
}
