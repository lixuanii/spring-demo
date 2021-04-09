package com.yunfan.staticDemo02;

import org.springframework.stereotype.Service;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/15:44
 * @Description: UserService
 */
@Service
public interface UserService {

    /**
     * 新增
     */
    void add();

    /**
     * 获取
     */
    void get();

    /**
     * 删除
     */
    void del();

    /**
     * 更新
     */
    void update();
}
