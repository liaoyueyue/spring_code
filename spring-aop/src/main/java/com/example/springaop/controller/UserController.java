package com.example.springaop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-06
 * Time: 15:36
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/hi")
    public String sayHi(String name) {
        System.out.println("执行了 sayHi方法");
        return "Hi " + name;
    }

    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("执行了 sayHello方法");
        return "Hello world";
    }
}
