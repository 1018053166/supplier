package com.supplier.admin.mapper;

import com.supplier.admin.domain.ShippingAddress;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingAddressMapper {
    int deleteByPrimaryKey(Integer saId);

    int insert(ShippingAddress record);

    int insertSelective(ShippingAddress record);

    ShippingAddress selectByPrimaryKey(Integer saId);

    int updateByPrimaryKeySelective(ShippingAddress record);

    int updateByPrimaryKey(ShippingAddress record);
}