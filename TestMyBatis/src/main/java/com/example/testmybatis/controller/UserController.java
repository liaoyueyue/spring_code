package com.example.testmybatis.controller;

import com.example.testmybatis.entity.UserInfo;
import com.example.testmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-29
 * Time: 17:06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getuserbyid")
    public UserInfo getUserById(Integer id) {
        if (id == null) {
            return null;
        }
        return userService.getUserById(id);
    }
}
