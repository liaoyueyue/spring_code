package com.example.springinterceptor.config;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-08
 * Time: 13:25
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandler {
    /**
     * 拦截所有的空指针异常，进行统一的数据返回了
     *
     * @param e
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)
    public HashMap<String, Object> nullPointException(NullPointerException e) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", "-1");
        result.put("msg", "空指针异常: " + e.getMessage()); // 错误码的描述信息
        result.put("data", null);
        return result;
    }

    /**
     * 保底异常
     * @param e
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public HashMap<String, Object> exception(Exception e) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", "-1");
        result.put("msg", "异常"); // 错误码的描述信息
        result.put("data", null);
        return result;
    }
}
