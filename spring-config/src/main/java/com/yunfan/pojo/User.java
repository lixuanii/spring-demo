package com.yunfan.pojo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/11:11
 * @Description: User
 */
@Data
public class User {

    @Value("小明")
    private String name;
}
