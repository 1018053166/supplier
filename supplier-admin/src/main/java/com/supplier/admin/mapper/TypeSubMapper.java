package com.supplier.admin.mapper;

import com.supplier.admin.domain.TypeSub;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeSubMapper {
    int deleteByPrimaryKey(String subId);

    int insert(TypeSub record);

    int insertSelective(TypeSub record);

    TypeSub selectByPrimaryKey(String subId);

    int updateByPrimaryKeySelective(TypeSub record);

    int updateByPrimaryKey(TypeSub record);
}