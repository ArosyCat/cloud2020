package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author zehao
 * @create 2021-10-21-10:44
 */
public interface AccountService {

    // 扣减账户
    void decrease(Long userId, BigDecimal money);

}