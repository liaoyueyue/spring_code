package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 19:47
 */
@Mapper
public interface UserMapper {
    /**
     * 用户注册
     * @param user 用户实体
     * @return 数据受影响的行数
     */
    int register(User user);

    /**
     * 用户登录
     * @param user 用户登陆
     * @return 数据受影响的行数
     */
    User login(User user);


}
