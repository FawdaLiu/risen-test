package com.gupaoedu.vip.design.proxy.dynamicproxy.gpproxy.client;


/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        /*GpMeipo gpMeipo = new GpMeipo();
        IPerson zhangsan = gpMeipo.getInstance(new Zhangsan());
        zhangsan.findLove("1111");*/
        String src = "IsUpperCase";
        char[] chars = src.toCharArray();
        System.out.println(Character.isUpperCase(chars[0]));

//        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
//        zhaoliu.findLove();
//        zhaoliu.buyInsure();


    }
}
