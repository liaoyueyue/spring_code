package com.liaoyueyue.springbootdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-22
 * Time: 22:31
 */
@Controller // 当前类为控制器
@ResponseBody // 返回的是数据，而非页面
public class TestController {
    @RequestMapping("/hi") // url 路由注册
    public String sayHi(String name) {
        // 为空为 null , 默认值处理
//        if (name == null || name.equals("")) {
//            name = "张三";
//        }
        if (!StringUtils.hasLength(name)) {
            name = "张三";
        }
        return "你好：" + name;
    }
}
