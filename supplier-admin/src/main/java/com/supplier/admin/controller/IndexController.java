package com.supplier.admin.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LinQ on 2017/3/7.
 */
@Controller
public class IndexController {

    private Logger logger = Logger.getLogger(this.getClass());


    @RequestMapping("/")
    public String index(){
        logger.info("=======index==========");
        return "index";
    }






}
