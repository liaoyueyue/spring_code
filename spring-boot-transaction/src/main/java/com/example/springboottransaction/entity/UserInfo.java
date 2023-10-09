package com.example.springboottransaction.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 14:06
 */
@Data
public class UserInfo {
    private Integer id;
    private String username;
    private String password;
    private String photo;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer state;

}
