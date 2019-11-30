package com.learning.mall.service.impl;

import com.learning.mall.common.utils.JwtTokenUtil;
import com.learning.mall.dao.UmsAdminRoleRelationDao;
import com.learning.mall.mbg.mapper.UmsAdminMapper;
import com.learning.mall.mbg.model.UmsAdmin;
import com.learning.mall.mbg.model.UmsPermission;
import com.learning.mall.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    //@Autowired
    @Resource
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Resource
    private UmsAdminMapper adminMapper;

    @Resource
    private UmsAdminRoleRelationDao adminRoleRelationDao;
    @Override
    public UmsAdmin getAdminByUsername(String username) {
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return null;
    }
}
