package com.example.springboottransaction.service;

import com.example.springboottransaction.entity.UserInfo;
import com.example.springboottransaction.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 14:25
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Integer add(UserInfo userInfo) {
        return userMapper.add(userInfo);
    }

}
