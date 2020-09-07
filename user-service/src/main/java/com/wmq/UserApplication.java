package com.wmq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月06日 17:13:00
 * @Description: TODO
 */
@MapperScan("com.wmq.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
