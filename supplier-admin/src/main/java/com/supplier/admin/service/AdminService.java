package com.supplier.admin.service;

import com.supplier.admin.domain.Admin;

public interface AdminService {

    /**
     * 添加管理员
     *
     * @param admin
     */
    void addAdmin(Admin admin);

    /**
     * 用户登录
     * @param username 用户名
     * @param password  密码
     * @return
     */
    Admin login(String username,String password);



}


