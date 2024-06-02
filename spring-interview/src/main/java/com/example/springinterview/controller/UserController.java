package com.example.springinterview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-06-02
 * Time: 22:21
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    public ModelAndView info() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userinfo");
        modelAndView.addObject("username", "admin");
        return modelAndView;
    }
}
