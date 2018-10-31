package com.zxp.dsjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.zxp.dsjy" })
public class DsjyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsjyApplication.class, args);
    }
}
