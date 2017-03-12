package com.supplier.admin.mapper;

import com.supplier.admin.domain.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {

    int deleteByPrimaryKey(String adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);


    Admin login(@Param("username") String username, @Param("password") String password);


}