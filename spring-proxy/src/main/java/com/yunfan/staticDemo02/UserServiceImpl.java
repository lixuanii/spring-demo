package com.yunfan.staticDemo02;

/**
 * @author : lixuan
 * @date : 2021/03/27/15:44
 * @description: UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("新增用户");
    }

    @Override
    public void get() {
        System.out.println("获取用户");
    }

    @Override
    public void del() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }
}
