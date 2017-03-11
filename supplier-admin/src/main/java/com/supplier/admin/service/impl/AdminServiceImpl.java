package com.supplier.admin.service.impl;

import com.supplier.admin.domain.Admin;
import com.supplier.admin.mapper.AdminMapper;
import com.supplier.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LinQ on 2017/3/11.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public void addAdmin(Admin admin) {
        adminMapper.insertSelective(admin);
    }
}
