package com.xjtu.yangban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xjtu.yangban.mapper")
public class YangBanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YangBanApplication.class, args);
    }

}
