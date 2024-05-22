package com.example.springinterview.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description: Bean的后置处理器，当Bean对象初始化之前以及初始化之后，会回调该接口对应的方法
 * User: liaoyueyue
 * Date: 2024-05-22
 * Time: 22:30
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    // 初始化之前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization " + beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    // 初始化之后提调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor.postProcessAfterInitialization " + beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
