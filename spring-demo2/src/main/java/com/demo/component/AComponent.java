package com.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-21
 * Time: 22:21
 */
@Component
public class AComponent {
    @Autowired
    private BComponent bComponent;

    /**
     * PostConstruct 后期施工
     * Construct 构造
     */
    @PostConstruct
    public void postConstruct() {
        System.out.println("执行了 A 对象的 PostConstruct");
    }
}
