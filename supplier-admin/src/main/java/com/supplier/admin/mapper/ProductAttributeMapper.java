package com.supplier.admin.mapper;

import com.supplier.admin.domain.ProductAttribute;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAttributeMapper {
    int deleteByPrimaryKey(Integer attrId);

    int insert(ProductAttribute record);

    int insertSelective(ProductAttribute record);

    ProductAttribute selectByPrimaryKey(Integer attrId);

    int updateByPrimaryKeySelective(ProductAttribute record);

    int updateByPrimaryKey(ProductAttribute record);
}