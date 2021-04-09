package com.yunfan.staticDemo01;

import lombok.Data;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/15:00
 * @Description: 房东
 */
@Data
public class Host implements Rent {

    /**
     * 房东只管出租房子这一件事情 其他的都交给别人去做
     */
    @Override
    public void rent() {
        System.out.println("我是房东要出租房子");
    }

}
