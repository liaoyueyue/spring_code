package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 20:24
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }

    public int register(User user) {
        return userMapper.register(user);
    }
}
