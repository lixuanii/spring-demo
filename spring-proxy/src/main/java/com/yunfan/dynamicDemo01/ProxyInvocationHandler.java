package com.yunfan.dynamicDemo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : lixuan
 * @date : 2021/03/27/16:40
 * @description: 会用这个类去动态生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Rent rent;

    /**
     * 处理代理实例，并返回结果
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现
        // Object invoke(Object obj, Object... args) 反射包下面的method
        // obj:被代理的对象
        return method.invoke(rent, args);
    }

    /**
     * 生成得到代理类
     *
     * @return
     */
    public Object getProxy() {
        //ClassLoader loader:当前class的classLoader
        //Class<?>[] interfaces, 被代理的接口
        //InvocationHandler h 调用处理程序
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }


    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
