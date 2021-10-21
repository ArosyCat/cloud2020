package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zehao
 * @create 2021-10-21-10:01
 */
@Mapper
public interface StorageDao {

    // 扣减库存信息
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);

}