package com.heng.comprehensive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.heng.comprehensive.mapper")
@RefreshScope
public class Payment8010Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8010Application.class, args);
    }
}