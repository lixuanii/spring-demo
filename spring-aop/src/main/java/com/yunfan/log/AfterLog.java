package com.yunfan.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author : lixuan
 * @date : 2021/03/27/18:02
 * @description: AfterLog
 */
public class AfterLog implements AfterReturningAdvice {

    /**
     * 方法执行之后 会执行这个方法
     *
     * @param result  返回值
     * @param method  方法
     * @param objects 参数
     * @param target  目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object result, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "返回结果为：" + result);
    }
}
