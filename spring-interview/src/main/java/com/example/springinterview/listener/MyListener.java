package com.example.springinterview.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-05-09
 * Time: 0:11
 */

/**
 * ApplicationListener:
 * 监听容器发布的事件，允许程序员执行自己的代码，完成事件驱动开发，它可以监听容器初始化完成、初始化失败等事件。通常情况下可以使用监听器加载资源，开启定时任务等
 */
public class MyListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        // ApplicationEvent event 对应的就是发布的事件，ApplicationReadyEvent,ApplicationFailedEvent
        if (event instanceof ApplicationReadyEvent) {
            // 容器初始化成功
            System.out.println(this.getClass().getName() + ": 容器初始化成功");
        }
        if (event instanceof ApplicationFailedEvent) {
            // 容器初始化失败
            System.out.println(this.getClass().getName() + ": 容器初始化失败");
        }
    }
}
