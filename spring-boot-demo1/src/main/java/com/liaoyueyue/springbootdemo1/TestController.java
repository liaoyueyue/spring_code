package com.liaoyueyue.springbootdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

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

    @Value("${mytest}")
    private String mytest;

    @Value("${myString1}")
    private String myString1;

    @Value("${myString2}")
    private String myString2;

    @Value("${myString3}")
    private String myString3;

    @Autowired
    private Student student;

    @PostConstruct
    public void postConstruct() {
//        System.out.println(myString1);
//        System.out.println(myString2);
//        System.out.println(myString3);
        System.out.println(student);
    }

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

    @RequestMapping("/getConfig")
    public String getConfig() {
        return mytest;
    }
}
