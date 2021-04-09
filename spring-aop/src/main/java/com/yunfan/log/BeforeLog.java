package com.yunfan.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author : lixuan
 * @date : 2021/03/27/17:59
 * @description: 日志输出 前置增强
 */
public class BeforeLog implements MethodBeforeAdvice {

    /**
     * 会在执行方法之前调用
     *
     * @param method  要执行的方法
     * @param objects 参数
     * @param o       目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
