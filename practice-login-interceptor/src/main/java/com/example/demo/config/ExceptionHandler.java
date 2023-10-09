package com.example.demo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description: 添加统一的错误处理
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 22:35
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public HashMap<String, Object> exception(Exception e) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", "-1");
        result.put("msg", "异常: " + e.getMessage());
        result.put("data", null);
        return result;
    }

}
