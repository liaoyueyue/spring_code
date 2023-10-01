package com.example.testmybatis.mapper;

import com.example.testmybatis.entity.UserInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-01
 * Time: 17:49
 */
@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    void getUserById() {
        UserInfo userInfo = userMapper.getUserById(1);
        System.out.println(userInfo);
        Assertions.assertEquals("123", userInfo.getPassword());
    }

    @Test
    void getUserInfoAll() {
        List<UserInfo> userInfoList = userMapper.getUserInfoAll();
        System.out.println(userInfoList);
        Assertions.assertEquals(1, userInfoList.size());
    }
}