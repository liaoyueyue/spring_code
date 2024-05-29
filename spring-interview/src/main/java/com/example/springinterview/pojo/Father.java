package com.example.springinterview.pojo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-05-29
 * Time: 23:11
 */

@Component
public class Father implements InitializingBean, DisposableBean {
    @Autowired
    Son son;

    @PostConstruct
    public void initMethod() {
        System.out.println("Father.initMethod 执行了");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Father.destroyMethod 执行了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Father.afterPropertiesSet 执行了");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Father.destroy 执行了");
    }
}
