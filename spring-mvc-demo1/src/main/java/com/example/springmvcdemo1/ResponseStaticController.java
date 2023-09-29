package com.example.springmvcdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-29
 * Time: 12:19
 */
@Controller
@RequestMapping("/request")
public class ResponseStaticController {
    @RequestMapping("/index")
    public String getIndex() {
        return "/index.html";
    }
}
