package com.example.springbootredisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-23
 * Time: 16:30
 */
@ResponseBody
@Controller
public class RedisController {
    // 1. 引入 redis 模板
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/set")
    public String setRedis() {
        stringRedisTemplate.opsForValue().set("username", "zhangsan");
        return "redis 存储成功";
    }

    @RequestMapping("/get")
    public String getRedis() {
        String result = stringRedisTemplate.opsForValue().get("username");
        return result;
    }
}
