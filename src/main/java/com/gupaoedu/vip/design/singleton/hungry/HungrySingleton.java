package com.gupaoedu.vip.design.singleton.hungry;

/**
 * <b>时间:</b> <i>2020-02-26 20:37</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.singleton}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * 优点：执行效率搞，性能高，没有任何锁
 * 缺点：某些情况下，可能会造成内存浪费，大量的出现的情况下不适用
 *
 * @author Fawda liuyl @since 1.0
 **/
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
