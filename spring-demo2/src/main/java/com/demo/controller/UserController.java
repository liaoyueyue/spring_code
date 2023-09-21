package com.demo.controller;

import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * com.demo.model.User: liaoyueyue
 * Date: 2023-09-17
 * Time: 20:50
 */
@Controller
public class UserController {

    @Autowired
    private User user1;

    public void getUser() {
        System.out.println("User:" + user1);
        User u = user1;
        u.setName("李四");
        System.out.println("u:" + u);
    }

    public String sayHi() {
        return "Hello world";
    }
}
