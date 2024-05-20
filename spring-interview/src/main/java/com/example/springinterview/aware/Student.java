package com.example.springinterview.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-05-21
 * Time: 0:48
 */

/**
 * Aware
 * 感知接口，Spring 提供的一种机制，通过实现该接口，重写方法，可以感知 Spring 应用程序执行过程中的一些变化
 * Spring 会判断当前的 Bean 有没有实现 Aware 接口，如果实现了，会在特定的时机回调接口对应的方法
 */

@Component
public class Student implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware {
    // BeanClassLoaderAware 回调方法
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Student.setBeanClassLoader:" + classLoader);
    }

    // BeanFactoryAware 回调方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Student.setBeanFactory:" + beanFactory);
    }

    // BeanNameAware 回调方法
    @Override
    public void setBeanName(String name) {
        System.out.println("Student.setBeanName:" + name);
    }
}
