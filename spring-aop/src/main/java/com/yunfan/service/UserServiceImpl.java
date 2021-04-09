package com.yunfan.service;

/**
 * @author : lixuan
 * @date : 2021/03/27/17:58
 * @description: UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    @Override
    public String add() {
        System.out.println("add");
        return "add接口返回成功";
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void get() {
        System.out.println("get");
    }
}
