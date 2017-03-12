package com.supplier.admin.mapper;

import com.supplier.admin.domain.Merchant;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantMapper {
    int deleteByPrimaryKey(String mId);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(String mId);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}