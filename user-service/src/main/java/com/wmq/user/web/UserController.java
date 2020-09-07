package com.wmq.user.web;

import com.wmq.user.pojo.User;
import com.wmq.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月06日 17:21:00
 * @Description: TODO
 */
@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    User queryById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }
}
