package com.example.t20240321.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-03-21
 * Time: 10:21
 */
@Controller
public class HomeController {
    @GetMapping(value = {"/", "/login"})
    public String login() {
        return "login";
    }
}
