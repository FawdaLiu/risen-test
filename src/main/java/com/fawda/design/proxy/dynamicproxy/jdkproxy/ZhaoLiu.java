package com.fawda.design.proxy.dynamicproxy.jdkproxy;

/**
 * <b>时间:</b> <i>2020-03-01 20:27</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.staticproxy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class ZhaoLiu implements IPerson {
    @Override
    public Object findLove(String sex, Integer age) {
        System.out.println("ZhaoLiu要求：肤白貌美大长腿！");
        return new Object();
    }
}
