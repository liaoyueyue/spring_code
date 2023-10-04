package com.example.testmybatis.mapper;

import com.example.testmybatis.entity.vo.ArticleInfoVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-04
 * Time: 16:06
 */
@SpringBootTest
class ArticleMapperTest {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void getById() {
        ArticleInfoVO articleInfoVO = articleMapper.getById(1);
        System.out.println(articleInfoVO);
    }
}