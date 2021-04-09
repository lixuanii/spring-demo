package com.yunfan.staticDemo01;

/**
 * @Author : lixuan
 * @Date : 2021/03/27/15:02
 * @Description: Proxy 静态代理
 */
public class Proxy implements Rent {

    /**
     * 房东
     */
    private Host host;


    /**
     * 代理帮房东租房。 调用哪个host(房东)就租哪个host的rent()租房接口
     */
    @Override
    public void rent() {
        //中介的附属操作
        seeHouse();
        //房东的操作
        host.rent();
        intermediaryFee();
        signAContract();
    }

    public void seeHouse() {
        System.out.println("我是中介带你看房");
    }

    public void intermediaryFee() {
        System.out.println("我是中介还要收你中介费");
    }

    public void signAContract() {
        System.out.println("我是中介带你签合同");
    }

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }
}
