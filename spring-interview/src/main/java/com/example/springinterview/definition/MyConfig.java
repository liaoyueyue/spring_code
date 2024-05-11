package com.example.springinterview.definition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-05-11
 * Time: 23:33
 */
@Configuration
public class MyConfig {
    @Bean // ConfigurationClassBeanDefinition 描述
    public String hello() {
        return "hello";
    }
}
