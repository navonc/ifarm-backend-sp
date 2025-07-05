package com.ifarm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * iFarm 后端应用启动类
 * 
 * @author ifarm
 * @since 2024-01-01
 */
@SpringBootApplication
@MapperScan("com.ifarm.mapper")
public class IfarmApplication {

    public static void main(String[] args) {
        SpringApplication.run(IfarmApplication.class, args);
        System.out.println("iFarm 后端服务启动成功！");
    }
} 