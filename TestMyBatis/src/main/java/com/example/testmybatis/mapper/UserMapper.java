package com.example.testmybatis.mapper;

import com.example.testmybatis.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-29
 * Time: 16:48
 */

@Mapper
public interface UserMapper {
    UserInfo getUserById(@Param("user_id") Integer id);
}
