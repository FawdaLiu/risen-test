package com.fawda.design.builder;

import java.util.ArrayList;

/**
 * <b>时间:</b> <i>2020-03-01 18:03</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.builder}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        /*ArrayList<String> strings = new ArrayList<>();
        strings.add("engine boom");
        strings.add("start");
        strings.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(strings);
        benzBuilder.getCarModel().run();

        BmwBuilder bmwBuilder = new BmwBuilder();
        bmwBuilder.setSequence(strings);
        bmwBuilder.getCarModel().run();*/

        Director director = new Director();
        for (int i = 0; i < 100; i++) {
            director.getABenzModel().run();
        }

        for (int i = 0; i < 1000; i++) {
            director.getBBenzModel().run();
        }
        for (int i = 0; i < 1000; i++) {
            director.getBBmwModel().run();
        }
    }
}
