package com.example.springinterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        String applicationName = context.getEnvironment().getProperty("applicationName");
        System.out.println("applicationName = " + applicationName);
    }

}
