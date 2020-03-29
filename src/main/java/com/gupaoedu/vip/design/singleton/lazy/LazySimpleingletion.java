package com.gupaoedu.vip.design.singleton.lazy;

/**
 * <b>时间:</b> <i>2020-02-26 20:47</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.singleton.lazy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * 优点：节省了内存
 * 缺点：
 *
 * @author Fawda liuyl @since 1.0
 **/
public class LazySimpleingletion {
    private LazySimpleingletion() {}

    private static LazySimpleingletion instance;

    public static synchronized LazySimpleingletion getInstance() {
        if (instance == null) {
            instance = new LazySimpleingletion();
        }
        return instance;
    }
}
