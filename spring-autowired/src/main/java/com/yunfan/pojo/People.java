package com.yunfan.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/15:50
 * @Description: People
 */
@Data
public class People {

    private Cat cat;

    private Dog dog;

    private String name;


    @Autowired
    @Qualifier(value = "autowiredCat222")
    private Cat autowiredCat;

    @Autowired
//    @Resource
    private Dog autowiredDog;
}
