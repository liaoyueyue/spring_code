package com.example.springboottransaction.controller;

import com.example.springboottransaction.entity.UserInfo;
import com.example.springboottransaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-09
 * Time: 14:05
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private DataSourceTransactionManager transactionManager;

    @Autowired
    private TransactionDefinition transactionDefinition;

    @RequestMapping("/add1")
    public Integer add1(UserInfo userInfo) {
        // 非空校验
        if (userInfo == null || !StringUtils.hasLength(userInfo.getUsername()) || !StringUtils.hasLength(userInfo.getPassword())) {
            return 0;
        }
        // 1.开始事务
        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);

        // 为了前端更方便，这里直接插入创建和更新的时间数据
        userInfo.setCreateTime(LocalDateTime.now());
        userInfo.setUpdateTime(LocalDateTime.now());
        int result = userService.add(userInfo);
        System.out.println("result = " + result);

//        // 2.回滚事务
//        transactionManager.rollback(transactionStatus);

        // 3.提交事务
        transactionManager.commit(transactionStatus);

        return result;
    }

    @RequestMapping("/add2")
    @Transactional // 可在类和方法中添加，如果下面方法出现异常则会进行事务回滚
    public Integer add2(UserInfo userInfo) {
        // 非空校验
        if (userInfo == null || !StringUtils.hasLength(userInfo.getUsername()) || !StringUtils.hasLength(userInfo.getPassword())) {
            return 0;
        }
        int result = userService.add(userInfo);
        System.out.println("result = " + result);
        try {
            int num = 10/0;
        } catch (Exception e) {
//            1. 将错误抛出
//            throw e;
            System.out.println(e.getMessage());
//            2. 使用代码进行回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return result;
    }
}
