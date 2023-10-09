package com.example.demo.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 21:43
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 判断用户是否登录
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("user") != null) {
            // 用户已经登录
            return true;
        }
        // 用户没有登录重定向到登录界面或者返回 401/403 没有权限码
        response.sendRedirect("/login.html");
        return false;
    }
}
