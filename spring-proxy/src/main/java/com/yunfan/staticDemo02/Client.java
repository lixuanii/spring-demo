package com.yunfan.staticDemo02;

/**
 * @author : lixuan
 * @date : 2021/03/27/15:46
 * @description: Client
 */
public class Client {

    public static void main(String[] args) {
        //在不改变原有代码的情况下给他新增功能，那么代理模式是最佳选择

        //原来的角色只做原来的功能
        UserServiceImpl impl = new UserServiceImpl();
        impl.add();

        //代理角色输出日志
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(impl);
        proxy.add();
    }
}
