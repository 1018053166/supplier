package com.supplier.admin.controller;

import com.supplier.admin.domain.Admin;
import com.supplier.admin.service.AdminService;
import com.supplier.common.constants.SessionKey;
import com.supplier.common.util.EncrypDes;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author Linq
 * @description
 * @date 2017/3/12 15:55
 */
@RequestMapping("/admin")
@Controller
public class AdminController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private AdminService adminService;


    /**
     * 登录
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request,Map<String,Object> model){
        logger.info("=======login======");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        logger.info("username = {} , password = {}",username,password);

        if(StringUtils.isEmpty(username)){
            model.put("msg","用户名不能为空");
            return "admin/login";
        }
        if(StringUtils.isEmpty(password)){
            model.put("msg","密码不能为空");
            return "admin/login";
        }

        EncrypDes encrypDes = null;
        try {
            encrypDes = EncrypDes.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Admin admin = null;
        try {
            admin = adminService.login(username, encrypDes.encrypt(password));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(admin==null){
            model.put("msg","用户名或密码错误");
            return "admin/login";
        }

        request.getSession().setAttribute(SessionKey.ADMIN_USER_SESSION,admin);

        return "redirect:/index.html";
    }



}
