package com.yunfan.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author : lixuan
 * @date : 2021/03/29/14:08
 * @description: 注解方式实现aop
 */
@Aspect //表示这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.yunfan.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("====方法执行前：before====");
    }

    @After("execution(* com.yunfan.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("====方法执行后：after====");
    }

    /**
     * 在环绕增强中，我们可以给定义一个参数，代表我们要获取处理切入的点 joinPoint连接点
     */
    @Around("execution(* com.yunfan.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
    }

}
