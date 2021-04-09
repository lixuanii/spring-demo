package com.yunfan.service.impl;

import com.yunfan.dao.UserDao;
import com.yunfan.dao.impl.UserDaoImpl;
import com.yunfan.service.UserService;

/**
 * @Author : lixuan
 * @Date : 2021/03/25/16:12
 * @Description: UserServiceImpl
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //原来
    private UserDao test = new UserDaoImpl();


    //现在 利用set进行动态实现值的注入  set注入
    @Override
    public void setUserDao(UserDao userDao) {
        //这里无论谁实现了UserDao 我拿到的值就都是它
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUserDao();
    }
}
