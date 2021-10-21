package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zehao
 * @create 2021-10-15-15:44
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@PathVariable("id")Long id);

}