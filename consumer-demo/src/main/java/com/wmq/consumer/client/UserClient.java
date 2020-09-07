package com.wmq.consumer.client;

import com.wmq.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月07日 17:17:00
 * @Description: TODO
 */
@FeignClient(value = "user-service",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable("id") Long id);
}
