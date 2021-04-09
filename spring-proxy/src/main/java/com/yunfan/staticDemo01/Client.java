package com.yunfan.staticDemo01;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/15:01
 * @Description: Client 客户
 */
public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
