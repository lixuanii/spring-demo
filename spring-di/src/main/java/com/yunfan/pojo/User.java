package com.yunfan.pojo;

import lombok.Data;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/14:26
 * @Description: User
 */
@Data
public class User {

    private String name;

    private Integer age;

    public User() {
        System.out.println("我被初始化了");
    }


    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("name = " + name + ",age = " + age);
    }

}
