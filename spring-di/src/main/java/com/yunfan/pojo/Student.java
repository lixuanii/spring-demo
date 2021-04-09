package com.yunfan.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author : lixuan
 * @Date : 2021/03/26/13:41
 * @Description: Student
 */
@Data
public class Student {

    private String name;

    private Address address;

    private String[] books;

    private List<String> hobby;

    private Map<String,String> card;

    private Set<String> games;

    private Properties info;

    private String girlfriend;
}
