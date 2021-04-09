package com.yunfan.dynamicDemo01;

/**
 * @author : lixuan
 * @date : 2021/03/27/16:54
 * @description: Client
 */
public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //获取调用程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理外面要调用的接口对象
        pih.setRent(host);
        //获取代理的对象
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }
}
