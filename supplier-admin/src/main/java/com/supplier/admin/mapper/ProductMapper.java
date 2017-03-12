package com.supplier.admin.mapper;

import com.supplier.admin.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(String pid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKeyWithBLOBs(Product record);

    int updateByPrimaryKey(Product record);


    /**
     * 查看商品列表
     * @param map
     * @return
     */
    List<Product> findProduct(Map map);

    /**
     * 查看商品总条数
     * @param map
     * @return
     */
    int findProductCount(Map map);


}