package com.example.springaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-10-06
 * Time: 15:31
 */
@Aspect // 告诉框架是一个切面类
@Component
public class UserAspect {
    /**
     * 切点 （配置拦截规则）
     */
    @Pointcut("execution(* com.example.springaop.controller.UserController.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void beforeAdvice() {
        System.out.println("执行了前置通知");
    }

    @After("pointcut()")
    public void afterAdvice() {
        System.out.println("执行了后置通知");
    }

    @Around("pointcut()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("进入环绕通知");
        Object object = null;
        // 执行目标方法
        object = joinPoint.proceed();
        System.out.println("退出环绕通知");
        return object;
    }


}
