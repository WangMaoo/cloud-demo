package com.wmq.consumer.client;

import com.wmq.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月07日 17:37:00
 * @Description: TODO
 */
@Component
public class UserClientFallback implements UserClient{
    /**
     * Feign集成Hystrix熔断返回提示结果
     * @param id
     * @return
     */
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户查询出现异常！");
        return user;
    }
}
