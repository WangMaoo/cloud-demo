package com.wmq.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年09月07日 19:45:00
 * @Description: TODO
 */
@RestController
@RequestMapping("address")
public class AddressController {

    @GetMapping("me")
    public String myAddress() {
        return "我是谁";
    }
}
