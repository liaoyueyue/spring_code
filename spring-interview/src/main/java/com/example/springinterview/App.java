package com.example.springinterview;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        String applicationName = context.getEnvironment().getProperty("applicationName");
        System.out.println("applicationName = " + applicationName);
        /**
         * BeanFactory
         * 作用： Bean容器的根接口,提供Bean对象的创建、配置、依赖注入等功能
         * 常见实现类：DefaultListableBeanFactory
         *           AnnotationConfigServletServerApplicationContext
         */
        System.out.println("context.getClass() = " + context.getClass());
        App appBean = context.getBean(App.class);
        System.out.println("appBean = " + appBean);

        /**
         * BeanDefinition
         * 用于描述Bean，包括Bean的名称，Bean的属性，Bean的行为，实现的接口，添加的注解等等，Spring中，
         * Bean在创建之前，都需要封装成对应的BeanDefinition，然后根据BeanDefinition进一步创建Bean对象
         */
        // 获取 BeanDefinition 对象
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        BeanDefinition userDefinition = beanFactory.getBeanDefinition("user");
        BeanDefinition helloDefinition = beanFactory.getBeanDefinition("hello");
        System.out.println("userDefinition.getClass() = " + userDefinition.getClass());
        System.out.println("helloDefinition.getClass() = " + helloDefinition.getClass());

        /**
         * BeanFactoryPostProcessor
         * Bean工厂后置处理器，当BeanFactory准备好了后(Bean初始化之前)，
         * 会调用该接口的postProcessBeanFactory方法，经常用于新增BeanDefinition
         */
        System.out.println("context.getBean(\"admin\") = " + context.getBean("admin"));

    }

}
