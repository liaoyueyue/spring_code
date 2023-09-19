package com.demo.controller;

import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-19
 * Time: 19:08
 */
@Controller
public class StudentController {
    // 使用属性注入的方式获取 Bean
    @Autowired
    private StudentService studentService;

    public void sayHi() {
//        调用 StudentService
        studentService.sayHi();
    }
}
