package com.supplier.admin.service.impl;

import com.supplier.admin.domain.Product;
import com.supplier.admin.mapper.ProductMapper;
import com.supplier.admin.service.ProductService;
import com.supplier.common.constants.PageContant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Linq
 * @description
 * @date 2017/3/12 22:56
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    public Map findProduct(Map params) {
        HashMap hashMap = new HashMap();
        int total = productMapper.findProductCount(params);
        List<Product> rows = productMapper.findProduct(params);
        hashMap.put(PageContant.PAGE_ROWS,rows);
        hashMap.put(PageContant.PAGE_TOTAL,total);
        return hashMap;
    }
}
