package com.supplier.admin.mapper;

import com.supplier.admin.domain.ShippingCart;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingCartMapper {
    int deleteByPrimaryKey(Integer scId);

    int insert(ShippingCart record);

    int insertSelective(ShippingCart record);

    ShippingCart selectByPrimaryKey(Integer scId);

    int updateByPrimaryKeySelective(ShippingCart record);

    int updateByPrimaryKey(ShippingCart record);
}