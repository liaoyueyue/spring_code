package com.example.springinterview.initialize;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-05-21
 * Time: 1:02
 */

/**
 * InitializingBean DisposableBean
 * 初始化接口，当Bean被实例化好后，会回调里面的函数，经常用于做一些加载资源的工作
 * 销毁接口，当Bean被销毁之前，会回调里面的函数，经常用于做一些释放资源的工作
 */
@Component
public class Animal implements InitializingBean, DisposableBean {
    // PostConstructor, PreDestroy, 提供初始化方法和销毁方法
    @PostConstruct
    public void initMethod() {
        System.out.println("Animal.initMethod");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Animal.destroyMethod");
    }

    // 销毁方法  当 Bean 销毁之前会调用。
    @Override
    public void destroy() throws Exception {
        System.out.println("Animal.destroy");
    }

    // 初始化方法  类被实例化，该方法会立即执行。
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Animal.afterPropertiesSet");
    }
}
