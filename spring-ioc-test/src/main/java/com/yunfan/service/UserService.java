package com.yunfan.service;

import com.yunfan.dao.UserDao;

public interface UserService {

    void setUserDao(UserDao userDao);

    void getUser();
}
