package com.example.springmvcdemo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-26
 * Time: 21:23
 */
@Controller // 让框架启动时加载当前类
@RequestMapping("/test") // 路由注册
@ResponseBody // 让程序知道返回的是数据而不是静态页面
@Slf4j
public class TestController {
    //    @RequestMapping("/hi")
//    @RequestMapping(value = "/hi", method = RequestMethod.POST)
//    @PostMapping("/hi")
    @GetMapping("/hi")
    public String sayHi(String name, int value) {
        return "Hi, " + name + " | " + value;
    }

    @GetMapping("/num")
    public String getNum(Integer num) { // 这里类型使用包装类，如果使用基本类型网页上发送get请求不发送参数会报500
        return "num: " + num;
    }

    @GetMapping("/show-user")
    public String showUser(User user) { //example: http://localhost:8080/test/show-user?name=kun&id=1&age=18 ,其中参数名必须匹配
        return user.toString();
    }

    @GetMapping("show-time")
    public String showTime(@RequestParam("t1") String startTime, @RequestParam(value = "t2", required = false) String endTime) { // 参数的重命名; required 必须的
        return "startTime: " + startTime + " | endTime: " + endTime;
    }

    // 使用 JSON 来传递对象
    @PostMapping("show-json-user")
    public String showJsonUser(@RequestBody User user) {
        return user.toString();
    }

    // 使用 url 来传递数据
    @PostMapping("/login/{username}/and/{password}")
    public String login(@PathVariable String username, @PathVariable String password) { //PathVariable 路径变量
        return "username: " + username + " | password: " + password;
    }

    // 上传图片
    @RequestMapping("/upfile")
    public String upFile(@RequestPart("myFile") MultipartFile file) throws IOException { // MultipartFile 多部份文件
        String path = "C:\\users\\liaoyueyue\\desktop\\img.png";
        file.transferTo(new File(path));
        return path;
    }

    // 上传文件
    @RequestMapping("/upfile2")
    public String upfile2(@RequestPart("myFile") MultipartFile file) throws IOException {
        // 根目录 original 原来的；最早的；起初的；
        String path = "C:\\users\\liaoyueyue\\desktop\\";
        path += UUID.randomUUID().toString().replace("-", "") + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        file.transferTo(new File(path));
        return "文件已经保存至：" + path;
    }

    // parameter 参数
    // Spring MVC(Spring WEB) 内置了 HttpServletRequest 和 HttpServletResponse
    @GetMapping("/getparam")
    public String getParam(HttpServletRequest request) {
        return request.getParameter("param");
    }

    // 获取 Cookies
    @RequestMapping("/getcookies")
    public String getCK(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            log.error(cookie.getName() + ": " + cookie.getValue());
        }
        return "get cookies";
    }

    // 获取 Cookies2
    @RequestMapping("/getcookies2")
    public String getCK2(@CookieValue("hicookies") String cookie) {
        return "get cookies: " + cookie;
    }

    // 获取请求标头
    @RequestMapping("/getHeader")
    public String getRequestHeader(@RequestHeader("User-Agent") String agent) {
        return agent;
    }

    // 设置会话
    @RequestMapping("/setSession")
    public String setSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("userInfo", "alice");
        return "Set Session Success！";
    }

    // 获取会话
    @RequestMapping("/getSession")
    public String getSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("userInfo") != null) {
            return (String) session.getAttribute("userInfo");
        } else {
            return "Session not found";
        }
    }

    // 使用注释获取会话
    @RequestMapping("/getSession2")
    public String getSession2(@SessionAttribute("userInfo") String userInfo) {
        return userInfo;
    }

    // 返回 JSON 对象
    @RequestMapping("/respJson")
    public HashMap<String, String> respJson() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Java", "Java Value");
        hashMap.put("Mysql", "Mysql Value");
        hashMap.put("SpringBoot", "SpringBoot Value");
        return hashMap;
    }

}
