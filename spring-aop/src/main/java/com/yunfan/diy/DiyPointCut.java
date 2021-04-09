package com.yunfan.diy;

/**
 * @author : lixuan
 * @date : 2021/03/29/13:51
 * @description: 自定义切面
 */
public class DiyPointCut {

    /**
     * 自定义切入点
     */
    public void before(){
        System.out.println("=======方法执行前========");
    }

    /**
     * 自定义切入点
     */
    public void after(){
        System.out.println("=======方法执行后========");
    }
}
