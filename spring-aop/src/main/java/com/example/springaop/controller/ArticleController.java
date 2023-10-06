package com.example.springaop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-06
 * Time: 15:44
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @RequestMapping("/hi")
    public String sayHi() {
        return "Hi articleController";
    }
}
