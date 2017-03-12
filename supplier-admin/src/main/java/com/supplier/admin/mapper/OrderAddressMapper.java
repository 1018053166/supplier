package com.supplier.admin.mapper;

import com.supplier.admin.domain.OrderAddress;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderAddressMapper {
    int deleteByPrimaryKey(Integer oaId);

    int insert(OrderAddress record);

    int insertSelective(OrderAddress record);

    OrderAddress selectByPrimaryKey(Integer oaId);

    int updateByPrimaryKeySelective(OrderAddress record);

    int updateByPrimaryKey(OrderAddress record);
}