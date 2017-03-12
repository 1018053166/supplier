package com.supplier.admin.controller;

import com.alibaba.fastjson.JSON;
import com.supplier.admin.service.ProductService;
import com.supplier.common.domain.JsonResp;
import com.supplier.common.enums.RespCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Linq
 * @description 商品管理模块Controller
 * @date 2017/3/12 22:23
 */
@RequestMapping("/product")
@Controller
public class ProductController {


    @Autowired
    private ProductService productService;


    /**
     * 商品管理列表
     *
     * @param limit
     * @param offset
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String list(@RequestParam(value = "limit", required = false, defaultValue = "1") Integer limit,
                       @RequestParam(value = "offset", required = false, defaultValue = "20") Integer offset) {
        Map params = new HashMap();
        params.put("limit", limit);
        params.put("offset", offset);
        Map map = productService.findProduct(params);
        return JSON.toJSONString(
                new JsonResp(RespCodeEnum.SUCCESS.getCode(),
                        RespCodeEnum.SUCCESS.getValue(),
                        map));
    }


}
