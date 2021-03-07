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
    void find() {
        User user = userService.find(1196978513958141952L);
        System.out.println("id:" + user.getUserId());
        System.out.println("name:" + user.getUserName());
        System.out.println("phone:" + user.getUserPhone());
    }

    @Test
    void update() {
        Long userId = 1196978513958141952L;
        userService.update(userId);
        User user = userService.find(userId);
        System.out.println(user.getUserName());
    }

}