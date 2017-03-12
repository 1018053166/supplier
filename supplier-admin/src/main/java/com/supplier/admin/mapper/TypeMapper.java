package com.supplier.admin.mapper;

import com.supplier.admin.domain.Type;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMapper {
    int deleteByPrimaryKey(String typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}