package com.example.t20240321.mapper;

import com.example.t20240321.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author liaoyueyue
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-03-21 10:23:10
* @Entity com.example.t20240321.entity.User
*/
@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username} and password = #{password}")
    User login(String username, String password);
}




