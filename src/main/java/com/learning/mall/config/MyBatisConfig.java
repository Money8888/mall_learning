package com.learning.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.learning.mbg.mapper")
public class MyBatisConfig {
}
