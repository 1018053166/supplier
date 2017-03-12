package com.supplier.admin.mapper;

import com.supplier.admin.domain.GoodSunit;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodSunitMapper {
    int deleteByPrimaryKey(Integer guId);

    int insert(GoodSunit record);

    int insertSelective(GoodSunit record);

    GoodSunit selectByPrimaryKey(Integer guId);

    int updateByPrimaryKeySelective(GoodSunit record);

    int updateByPrimaryKey(GoodSunit record);
}