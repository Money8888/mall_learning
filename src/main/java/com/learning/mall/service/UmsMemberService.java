package com.learning.mall.service;

import com.learning.mall.common.api.CommonResult;

// 会员管理业务操作
public interface UmsMemberService {
    // 生成验证码
    CommonResult generateAuthCode(String telephone);
    // 判断验证码和手机号是否匹配
    CommonResult verifyAuthCode(String telephone, String authCode);
}
