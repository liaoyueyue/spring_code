package com.example.testmybatis.entity.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-04
 * Time: 15:44
 */
@Data
public class ArticleInfoVO{
    private int id;
    private String title;
    private String content;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int uid;
    private int rCount;
    private int state;
    private String username;
}
