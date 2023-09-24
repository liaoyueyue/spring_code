package com.example.springbootdemo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-24
 * Time: 18:37
 */
@Controller
@ResponseBody   // 用来设置当前类所有的方法返回的是数据而非页面
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/hi")
    public String sayHi() {
        logger.trace("我是 trace");
        logger.debug("我是 debug");
        logger.info("我是 info");
        logger.warn("我是 warn");
        logger.error("我是 error");
        return "Hi SpringBoot";
    }

    @Autowired
    User user;
    @RequestMapping("/getUserInfo")
    public String getUserInfo(String account, String password) {
        user.setAccount("account");
        user.setPassword("password");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String datetime = simpleDateFormat.format(System.currentTimeMillis());
        String datetime = String.valueOf(LocalDateTime.now());
        return String.format("账号：%s\n密码：%s\n%s", account, password, datetime);
    }


}
