package com.liaoyueyue.springbootdemo1;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-24
 * Time: 2:52
 */
@Component
@ConfigurationProperties("student")
@Data
public class Student {
    private int id;
    private String name;
    private int age;
}
