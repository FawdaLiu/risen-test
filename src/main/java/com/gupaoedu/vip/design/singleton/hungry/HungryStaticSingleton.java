package com.gupaoedu.vip.design.singleton.hungry;

/**
 * <b>时间:</b> <i>2020-02-26 20:37</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.singleton}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * 先静态后动态
 * 先上后下
 * 先属性后方法
 *
 * @author Fawda liuyl @since 1.0
 **/
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
