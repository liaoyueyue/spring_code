package com.example.testmybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-29
 * Time: 16:43
 */
@Data
public class UserInfo implements Serializable {
    private final long serializableId = 1L;

    private int id;
    private String username;
    private String password;
    private String photo; // 头像
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int state;
}
