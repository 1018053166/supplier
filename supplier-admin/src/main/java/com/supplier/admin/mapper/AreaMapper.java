package com.supplier.admin.mapper;

import com.supplier.admin.domain.Area;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}