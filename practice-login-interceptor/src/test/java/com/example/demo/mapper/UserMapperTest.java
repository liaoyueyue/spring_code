package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 19:54
 */
@SpringBootTest
class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Test
    void register() {
        User user = new User();
        user.setUsername("alice");
        user.setPassword("123");
        int result = userMapper.register(user);
        System.out.println("result = " + result + "\nid: " + user.getId());
        Assertions.assertEquals(1, result);
    }

    @Test
    void login() {
        User user = new User();
        user.setUsername("alice");
        user.setPassword("123");
        User localUser = userMapper.login(user);
        if (localUser == null) {
            System.out.println("用户不存在");
        } else {
            System.out.println("欢迎" + localUser.getUsername() + "!");
        }
    }
}