package com.example.springbootdemo2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-24
 * Time: 21:18
 */
@Data
@Component
@ConfigurationProperties("user")    //Configuration 配置; Properties 财产/特性
public class User {
    String account;
    String password;
}
