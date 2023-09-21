package com.demo.model;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * com.demo.model.User: liaoyueyue
 * Date: 2023-09-17
 * Time: 17:00
 */
@Data
public class User {
    int id;
    String name;
    String password;
    public String sayHi() {
        return "Hello world";
    }
}
