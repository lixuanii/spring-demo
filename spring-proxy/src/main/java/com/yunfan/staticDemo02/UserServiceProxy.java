package com.yunfan.staticDemo02;

/**
 * @author : lixuan
 * @date : 2021/03/27/16:00
 * @description: UserServiceProxy 静态代理
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void get() {
        log("get");
        userService.get();
    }

    @Override
    public void del() {
        log("del");
        userService.del();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    /**
     * 增加日志功能
     */
    public void log(String msg) {
        System.out.println(msg + "方法输出日志");
    }


}
