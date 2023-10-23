package com.example.springbootredisdemo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-23
 * Time: 18:06
 */
@RestController
public class UserController {
    private final static String SESSION_KEY = "USER_SESSION_KEY";

    @RequestMapping("/login")
    public String login(HttpSession session) {
        // 存储 session 到 redis
        session.setAttribute(SESSION_KEY, "zhangsan");
        return "login_success";
    }

    @RequestMapping("/get")
    public String get(HttpServletRequest request) {
        String username = "暂无";
        HttpSession session = request.getSession(false);
        if (session != null) {
            // 从 redis 中获取 session 用户
            Object userinfo = session.getAttribute(SESSION_KEY);
            if (userinfo != null) {
                return userinfo.toString();
            }
        }
        return username;
    }
}
