package com.example.springboottransaction.mapper;

import com.example.springboottransaction.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 14:14
 */
@Mapper
public interface UserMapper {
    int add(UserInfo userInfo);
}
