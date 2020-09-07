package com.wmq.consumer.web;

import com.wmq.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月06日 17:40:00
 * @Description: TODO
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;


    /*@GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        String url = "http://localhost:8081/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }*/

    /*@GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        *//**
         * 通过服务者的名称获取实例
         *//*
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance instance = instances.get(0);
        String url = String.format("http://%s:%s/user/%s", instance.getHost(), instance.getPort(), id);
        return restTemplate.getForObject(url, User.class);
    }*/

    /**
     * 负载均衡，同构服务名称直接获取
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        String url = "http://user-service/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }

}
