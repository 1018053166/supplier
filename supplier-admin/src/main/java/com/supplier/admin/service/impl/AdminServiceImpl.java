package com.supplier.admin.service.impl;

import com.supplier.admin.domain.Admin;
import com.supplier.admin.mapper.AdminMapper;
import com.supplier.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员类
 *
 * @author Linq
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 添加管理员
     *
     *
     * @param admin
     */
    public void addAdmin(Admin admin) {
        adminMapper.insertSelective(admin);
    }

    /**
     *
     * @param username 用户名
     * @param password  密码
     * @return
     */
    public Admin login(String username, String password) {
        return adminMapper.login(username,password);
    }
}
