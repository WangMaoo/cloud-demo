package com.wmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月06日 17:36:00
 * @Description: TODO
 */
@SpringBootApplication
public class ConsumerApplication {

    /**
     *  注册restTemplate到spring容器中
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
