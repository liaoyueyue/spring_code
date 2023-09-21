package com.demo.controller;

import com.demo.model.User;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-21
 * Time: 21:33
 */
@Controller
public class UserAdviceController {
    @Resource
    private User user1;

    public void getUser() {
        user1.setName("王五");
        System.out.println("王五 | user1 : " + user1);
    }


}
