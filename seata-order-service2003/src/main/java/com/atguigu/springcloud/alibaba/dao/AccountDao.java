package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author zehao
 * @create 2021-10-21-10:33
 */
@Mapper
public interface AccountDao {

    // 扣减账户
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);

}
