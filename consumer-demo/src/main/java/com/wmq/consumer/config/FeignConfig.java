package com.wmq.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月07日 18:14:00
 * @Description: TODO
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLever() {
        return Logger.Level.BASIC;
    }
}
