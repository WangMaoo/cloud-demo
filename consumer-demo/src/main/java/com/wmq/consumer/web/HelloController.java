package com.wmq.consumer.web;

import com.wmq.consumer.config.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月09日 19:36:00
 * @Description: TODO
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private RedisProperties redisProperties;

    @RequestMapping("prop")
    public RedisProperties hello() {
        return redisProperties;
    }
}
