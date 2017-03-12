package com.supplier.admin.mapper;

import com.supplier.admin.domain.Freight;
import org.springframework.stereotype.Repository;

@Repository
public interface FreightMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(Freight record);

    int insertSelective(Freight record);

    Freight selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(Freight record);

    int updateByPrimaryKey(Freight record);
}