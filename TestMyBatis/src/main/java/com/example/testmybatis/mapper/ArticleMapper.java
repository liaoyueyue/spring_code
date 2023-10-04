package com.example.testmybatis.mapper;

import com.example.testmybatis.entity.vo.ArticleInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-04
 * Time: 16:05
 */
@Mapper
public interface ArticleMapper {
    ArticleInfoVO getById(@Param("id") int id);
}
