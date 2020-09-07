package com.wmq.user.service;

import com.wmq.user.mapper.UserMapper;
import com.wmq.user.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月06日 17:19:00
 * @Description: TODO
 */
@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findById(Long id) {
        return userMapper.findById(id);
    }
}
