package com.yunfan.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/10:05
 * @Description: User
 */
@Data
//等同于 <bean id="user" class="com.yunfan.pojo.User"/>  自动装配bean
@Component
public class User {

    @Value("小明")
    public String name;
}
