package com.example.springinterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-08
 * Time: 12:19
 */
@RestController
@RequestMapping("/user")
public class UserController {
//    @GetMapping
//    public String getMethod() {
//        return "执行 get 请求";
//    }
//
//    @PostMapping
//    public String postMethod() {
//        return "执行 post 请求";
//    }

    @RequestMapping("/getuser")
    public String getUser() {
        System.out.println("执行了 getUser");
        return "get user";
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("执行了 login");
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        System.out.println("执行了 register");
        return "register";
    }

    @RequestMapping("/getnum")
    public Integer getNum() {
        return new Random().nextInt(100);
    }
}
