package com.xjt.proxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xjt.proxy.domain.User;
import com.xjt.proxy.service.UserService;

/**
 * @author kevin
 * @date 2019-11-20 14:23
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> userList() {
        return userService.listUser();
    }

    @RequestMapping("/update")
    public int update() {
        return userService.update();
    }
}
