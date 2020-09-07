package com.wmq;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月06日 17:36:00
 * @Description: TODO
 */
@SpringCloudApplication
@EnableFeignClients
public class ConsumerApplication {

    /**
     *  注册restTemplate到spring容器中
     */
    /*@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }*/

    /**
     * feignClients集成了负载均衡
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
