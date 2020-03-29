package com.fawda.design.builder;

import java.util.ArrayList;

/**
 * <b>时间:</b> <i>2020-03-01 17:59</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.builder}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class BmwModel extends CarModel {
    @Override
    public void start() {
        System.out.println("BmwModel start");
    }

    @Override
    public void stop() {
        System.out.println("BmwModel stop");
    }

    @Override
    public void alarm() {
        System.out.println("BmwModel alarm");
    }

    @Override
    public void engineBoom() {
        System.out.printf("BmwModel engineBoom");
    }
}
