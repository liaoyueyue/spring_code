package com.example.testmybatis.entity.vo;

import com.example.testmybatis.entity.ArticleInfo;
import lombok.Data;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-04
 * Time: 15:44
 */
@Data
public class ArticleInfoVO extends ArticleInfo{
    private String username;

    @Override
    public String toString() {
        return "ArticleInfoVO{" +
                "username='" + username + '\'' +
                '}' + super.toString();
    }
}
