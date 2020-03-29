package com.gupaoedu.vip.design.proxy.dynamicproxy.gpproxy.client;

/**
 * Created by Tom.
 */
public class Zhangsan implements IPerson {

    public void findLove(String name) {
        System.out.println("张三要求：肤白貌美大长腿"+name);
    }

    public int buyInsure() {
        System.out.println("30万");
        return 0;
    }

}
