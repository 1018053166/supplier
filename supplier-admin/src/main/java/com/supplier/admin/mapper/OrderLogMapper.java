package com.supplier.admin.mapper;

import com.supplier.admin.domain.OrderLog;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLogMapper {
    int deleteByPrimaryKey(Integer olId);

    int insert(OrderLog record);

    int insertSelective(OrderLog record);

    OrderLog selectByPrimaryKey(Integer olId);

    int updateByPrimaryKeySelective(OrderLog record);

    int updateByPrimaryKey(OrderLog record);
}