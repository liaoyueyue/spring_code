package com.example.testmybatis.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-29
 * Time: 16:43
 */
@Data
public class UserInfo {
    private int id;
    private String username;
    private String password;
    private String photo; // 头像
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    private int state;
}
