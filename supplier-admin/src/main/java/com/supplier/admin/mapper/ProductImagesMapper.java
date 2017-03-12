package com.supplier.admin.mapper;

import com.supplier.admin.domain.ProductImages;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImagesMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ProductImages record);

    int insertSelective(ProductImages record);

    ProductImages selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ProductImages record);

    int updateByPrimaryKey(ProductImages record);
}