package com.example.testmybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-04
 * Time: 15:40
 */
@Data
public class ArticleInfo implements Serializable {
    private final long serializableId = 1L;

    private int id;
    private String title;
    private String content;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int uid;
    private int rCount;
    private int state;
}
