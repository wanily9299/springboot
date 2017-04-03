package com.example.zhouwei.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhouwei on 2017/3/30.
 */
@Configuration
@MapperScan(basePackages = "com.example.zhouwei.mapper")
public class MybatisConfig {

}
