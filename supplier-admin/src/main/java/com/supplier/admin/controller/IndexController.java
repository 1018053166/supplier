package com.supplier.admin.controller;

import com.supplier.admin.domain.Admin;
import com.supplier.admin.service.AdminService;
import com.supplier.common.util.EncrypDes;
import com.supplier.common.util.IpUtils;
import com.supplier.common.util.UUIDUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * IndexController
 */
@Controller
@RequestMapping("/")
public class IndexController {


    private Logger logger = Logger.getLogger(this.getClass());


    @Autowired
    private AdminService adminService;


    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/")
    public String i() {
        logger.info("=======/==========");
        return "index";
    }

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/index.html")
    public String index() {
        logger.info("=======index==========");
        return "index";
    }


    /**
     * 跳转到登录页面
     *
     * @return
     */
    @RequestMapping("/login.html")
    public String login() {
        logger.info("=====login=====");
        return "/admin/login";
    }


    /**
     * 首页主页面
     * @return
     */
    @RequestMapping("main.html")
    public String main(){
        logger.info("=====main=====");
        return "/include/main";
    }


    /**
     * 商品管理页面
     * @return
     */
    @RequestMapping("product.html")
    public String product(){
        logger.info("=====product=====");
        return "/product/product";
    }

    /**
     * 添加商品页面
     *
     * @return
     */
    @RequestMapping("product/add.html")
    public String addProduct(){
        logger.info("=====add product=====");
        return "/product/add";
    }



    /**
     * Test
     *
     * @return
     */
    @RequestMapping("/test")
    public String test() {
        EncrypDes des = null;
        try {
            des = EncrypDes.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Admin admin = new Admin();

        admin.setAdminId(UUIDUtil.getUUID());
        admin.setAdminAccount("xiaoba");
        admin.setAdminEmail("1018053166@qq.com");
        admin.setAdminNickname("小八");

        try {
            admin.setAdminPwd(des.encrypt("123456"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        admin.setAdminRealname("Linq");
        admin.setAdminSex(0);
        admin.setAdminState(0);
        admin.setCreateTime(new Date());
        admin.setLastTime(new Date());
        admin.setLastIp(IpUtils.getIpAddress());
        adminService.addAdmin(admin);
        return "index";
    }


}