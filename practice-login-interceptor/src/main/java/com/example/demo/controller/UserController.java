package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 20:22
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(User user) {
        // 非空验证
        if (!StringUtils.hasLength(user.getUsername()) || !StringUtils.hasLength(user.getPassword())) {
            return "请输入用户名和密码";
        }

        User localUser = userService.login(user);
        if (localUser == null || localUser.getUsername().isEmpty()) {
            return "登录失败请检查用户名或者密码";
        }
        return "欢迎 " + localUser.getUsername();
    }

    @RequestMapping("/register")
    public String register(User user) {
        // 非空验证
        if (!StringUtils.hasLength(user.getUsername()) || !StringUtils.hasLength(user.getPassword())) {
            return "请输入用户名和密码";
        }
        return userService.register(user) == 1 ? "注册成功： " + user.getUsername() : "注册失败！";
    }
}
