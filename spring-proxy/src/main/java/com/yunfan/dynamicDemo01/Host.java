package com.yunfan.dynamicDemo01;

import lombok.Data;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/15:00
 * @Description: 房东
 */
@Data
public class Host implements Rent {

    private String name;

    /**
     * 房东只管出租房子这一件事情 其他的都交给别人去做
     */
    @Override
    public void rent() {
        System.out.println("我是" + this.name + "房东,我出租房子");
    }

}
