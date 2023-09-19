package com.demo.component;

import com.demo.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-19
 * Time: 18:56
 */
@Controller
public class StudentBeans {
    @Bean(name = {"student1"})
    public Student getStudentBean1() {
        Student student = new Student();
        student.setId(1);
        student.setName("mary");
        student.setAge(18);
        return student;
    }

    @Bean(name = {"student2"})
    public Student getStudentBean2() {
        Student student = new Student();
        student.setId(2);
        student.setName("alice");
        student.setAge(19);
        return student;
    }
}
