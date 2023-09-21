package com.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-21
 * Time: 22:22
 */
@Component

public class BComponent {
    @Autowired
    private CComponent cComponent;

    @PostConstruct
    public void postConstruct() {
        System.out.println("执行了 B 对象的 PostConstruct");
    }
}
