package com.yunfan.dynamicDemo02;

import com.yunfan.staticDemo02.UserService;
import com.yunfan.staticDemo02.UserServiceImpl;

/**
 * @author : lixuan
 * @date : 2021/03/27/17:08
 * @description: Client
 */
public class Client {

    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //获取调用程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要生成的代理对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService service = (UserService) pih.getProxy();
        service.add();
    }

}
