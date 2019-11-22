package com.xjt.proxy.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xjt.proxy.domain.User;

/**
 * @author kevin
 * @date 2019-11-22 16:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void listUser() {
        List<User> users = userService.listUser();
        for (User user : users) {
            System.out.println(user.getUserId());
            System.out.println(user.getUserName());
            System.out.println(user.getUserPhone());
        }
    }

    @Test
    void update() {
        userService.update();
        User user = userService.find();
        System.out.println(user.getUserName());
    }
}