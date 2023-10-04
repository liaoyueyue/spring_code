package com.example.testmybatis.mapper;

import com.example.testmybatis.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-29
 * Time: 16:48
 */

@Mapper
public interface UserMapper {
    /**
     * 根据用户 id 查询用户信息
     * @param userId 用户 id
     * @return 用户信息
     */
    UserInfo getUserById(@Param("userId") Integer userId);

    /**
     * 获取每个用户的信息
     * @return 所有用户信息列表
     */
    List<UserInfo> getUserInfoAll();

    /**
     * 添加用户信息
     * @param userInfo 用户信息实体
     * @return 数据库影响行数
     */

    int addUserInfo(UserInfo userInfo);

    /**
     * 添加用户信息并返回用户 id
     * @param userInfo 用户信息实体
     * @return 数据库影响行数
     */
    int addGetUserInfo(UserInfo userInfo);

    /**
     * 修改用户名
     * @param userInfo 用户信息实体
     * @return 数据库影响行数
     */
    int updateUsername(UserInfo userInfo);

    /**
     * 根据用户 id 来删除用户信息
     * @param id 用户 id
     * @return 数据库影响行数
     */
    int delUserById(Integer id);


    /**
     * 根据排序规则来获取每个用户的信息
     * @param order 排序的规则
     * @return 所有用户信息列表
     */
    List<UserInfo> getListByOrder(@Param("order") String order);

    /**
     * 用户登录操作
     * @param username 用户名
     * @param password 用户密码
     * @return 用户信息
     */
    UserInfo login(@Param("username") String username,@Param("password") String password);

    /**
     * 使用模糊用户名查询用户
     * @param fuzzyName 模糊用户名
     * @return 用户信息
     */
    List<UserInfo> getUserByFuzzyName(@Param("fuzzyName") String fuzzyName);

}
