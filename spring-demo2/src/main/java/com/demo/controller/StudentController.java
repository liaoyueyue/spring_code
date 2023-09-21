package com.demo.controller;

import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * com.demo.model.User: liaoyueyue
 * Date: 2023-09-19
 * Time: 19:08
 */
@Controller
public class StudentController {
//    // 1.使用属性注入的方式获取 Bean
//    @Autowired
//    private StudentService studentService;

//    // 2.使用 set 注入
//    private StudentService studentService;
//
//    @Autowired
//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }

//    // 3.使用构造方法注入
//    private StudentService studentService;
//
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }

//    // 4.使用Resource注入
//    @Resource
//    private StudentService studentService;

    // 5.使用Resource注入、使用 Qualifier 过滤
    @Resource
    @Qualifier(value = "student2")
    private StudentService studentService;

    /**
     * @Autowired 与 @Resource  区别
     * 出身不同：@Resource是JDK提供的、@Autowired是Spring提供的
     * 功能支持不同：@Autowired支持属性注入、setter注入、构造方法注入，而@Resource不支持构造方法注入
     * 参数支持不同：@Resource支持更多的参数设置，而@Autowired只支持required
     */


    public void sayHi() {
//        调用 StudentService
        studentService.sayHi();
    }
}
