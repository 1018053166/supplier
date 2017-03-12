package com.supplier.admin.service;

import java.util.Map;

/**
 * @author Linq
 * @description 商品管理Service
 * @date 2017/3/12 22:26
 */
public interface ProductService {

    /**
     * 获取商品列表和总条数
     * @param params
     * @return
     */
    Map findProduct(Map params);

}
