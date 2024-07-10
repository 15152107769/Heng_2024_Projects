package com.heng.comprehensive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.heng.comprehensive.mapper")
public class Payment8010Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8010Application.class, args);
    }
}