package com.supplier.admin.mapper;

import com.supplier.admin.domain.OrderPayLog;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPayLogMapper {
    int deleteByPrimaryKey(String payId);

    int insert(OrderPayLog record);

    int insertSelective(OrderPayLog record);

    OrderPayLog selectByPrimaryKey(String payId);

    int updateByPrimaryKeySelective(OrderPayLog record);

    int updateByPrimaryKey(OrderPayLog record);
}