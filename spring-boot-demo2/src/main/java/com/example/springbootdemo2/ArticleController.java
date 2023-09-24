package com.example.springbootdemo2;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-24
 * Time: 23:10
 */
@Controller
@ResponseBody
@RequestMapping("/article")
@Slf4j
public class ArticleController {
//    // 1. 得到日志对象, 可使用 lombok 的注解来代替
//    public static final Logger logger = LoggerFactory.getLogger(ArticleController.class);
    @RequestMapping("/hi")
    public String sayHi() {
        log.info("这里是 slf4j 的 info");
        return "Hi ArticleController";
    }
}
