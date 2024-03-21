package com.example.t20240321.controller;

import com.example.t20240321.common.AjaxResult;
import com.example.t20240321.entity.User;
import com.example.t20240321.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-03-21
 * Time: 10:15
 */
@RestController
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public AjaxResult login(String username, String password, String captcha) {
        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password) || !StringUtils.hasLength(captcha)) {
            return AjaxResult.fail(-1, "illegal request");
        }
        User user = userMapper.login(username, password);
        if (user != null) {
            user.setPassword("");
            return AjaxResult.success(user.toString() + " | 验证码：" +captcha);
        }
        return AjaxResult.fail(-1, "illegal request");
    }
}
