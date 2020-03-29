package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.design.singleton.register.EnumSingleton;

/**
 * <b>时间:</b> <i>2020-02-26 21:53</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.pattern.singleton.test}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());
        System.out.println(instance.getData());;
    }
}
