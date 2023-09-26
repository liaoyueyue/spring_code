package com.example.springmvcdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
}
