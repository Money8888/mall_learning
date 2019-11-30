package com.learning.mall.service;

import com.learning.mall.mbg.model.UmsAdmin;
import com.learning.mall.mbg.model.UmsPermission;

import java.util.List;

// 后台管理员
public interface UmsAdminService {
    // 根据用户名获取后台管理员
    UmsAdmin getAdminByUsername(String username);
    // 注册
    UmsAdmin register(UmsAdmin umsAdminParam);
    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return 生成的Jwt的token'
     */
    String login(String username, String password);

    // 获取用户所有权限
    List<UmsPermission>getPermissionList(Long adminId);


}
