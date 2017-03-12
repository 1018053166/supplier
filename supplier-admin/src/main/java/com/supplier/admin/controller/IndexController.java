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
 * Created by LinQ on 2017/3/7.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private AdminService adminService;

    @RequestMapping("/")
    public String index(){
        System.out.println("========index=============");
        logger.info("=======index==========");

        return "index";
    }

    @RequestMapping("/aa")
    public String aa(){
        System.out.println("IndexController.aa=========");
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
