package com.example.springinterview.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-05-08
 * Time: 23:40
 */

/**
 * ApplicationContextInitializer:
 * I0C容器对象创建完成后执行,可以对上下文环境做一些操作，例如运行环境属性注册等
 */
public class MyContextInitializer implements ApplicationContextInitializer {
    // IOC 容器对象创建完毕后执行， 常用于环境属性注册
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // 给上下文 context 对象注入环境属性
        // 1. 准备属性
        Map<String, Object> myMap = new HashMap<>();
        myMap.put("applicationName", "MyApplicationContextInitializer");
        // 2. 获取属性资源管理对象
        // 获取到环境对象
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        // 属性资源管理对象
        MutablePropertySources propertySources = environment.getPropertySources();
        // 3. 注册
        propertySources.addLast(new MapPropertySource("myMap", myMap));

        // 容器初始化失败
        // int i = 1/0;
    }
}
