package com.learning.mall.dao;

import com.learning.mall.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface  UmsAdminRoleRelationDao {
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
