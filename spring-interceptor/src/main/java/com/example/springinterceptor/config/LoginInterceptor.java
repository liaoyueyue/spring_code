package com.example.springinterceptor.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-08
 * Time: 12:30
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 用户登录判断
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("userinfo")!= null) {
            // 用户已经登录
            return true;
        }
        // 可以重定向到登录界面或者返回 401/403 没有权限码
        response.sendRedirect("/login.html");
        return false;
    }
}
