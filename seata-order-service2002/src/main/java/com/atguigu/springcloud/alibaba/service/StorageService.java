package com.atguigu.springcloud.alibaba.service;

import org.springframework.stereotype.Service;

/**
 * @author zehao
 * @create 2021-10-21-10:12
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId,Integer count);

}
