package com.yunfan.pojo;

import lombok.Data;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/9:48
 * @Description: User
 */
@Data
public class User {

    private String name;

    public void show() {
        System.out.println("name = " + name);
    }

    public User(String name) {
        this.name = name;
        System.out.println("测试有参注入 这是：" + getName());
    }

    public User() {
        System.out.println("这是测试无参注入");
    }
}
