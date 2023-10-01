package com.example.testmybatis.mapper;

import com.example.testmybatis.entity.UserInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
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

    @Test
    void addUserInfo() {
        // 伪代码
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("alice");
        userInfo.setPassword("123");
        userInfo.setCreateTime(LocalDateTime.now());
        userInfo.setUpdateTime(LocalDateTime.now());
        int result = userMapper.addUserInfo(userInfo);
        System.out.println(getClass().getName() + "受影响的行数: " + result);
        Assertions.assertEquals(1, result);
    }

    @Test
    void addGetUserInfo() {
        // 伪代码
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("anna");
        userInfo.setPassword("123");
        userInfo.setCreateTime(LocalDateTime.now());
        userInfo.setUpdateTime(LocalDateTime.now());
        int result = userMapper.addGetUserInfo(userInfo);
        System.out.println(getClass().getName() + "受影响的行数: " + result);
        int uid = userInfo.getId(); // 这里获取到的 id 是写了相应注释后 mybatis 帮助做的
        System.out.println("用户id = " + uid);
        Assertions.assertEquals(1, result);
    }

    @Test
    void updateUsername() {
        // 伪代码
        UserInfo userInfo = new UserInfo();
        userInfo.setId(5);
        userInfo.setUsername("mike");
        int result = userMapper.updateUsername(userInfo);
        System.out.println("result = " + result);
        Assertions.assertEquals(1, result);
    }

    @Test
    @Transactional
    // Transactional 交易的；交易的，业务的；- 这个注释可以让下面的方法不会真的影响数据库
    void delUserById() {
        int result = userMapper.delUserById(4);
        System.out.println("result = " + result);
        Assertions.assertEquals(1, result);
    }
}