package com.gupaoedu.vip.design.singleton.lazy;

/**
 * <b>时间:</b> <i>2020-02-26 21:14</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.singleton.lazy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * 优点：性能高了，线程也安全了
 * 缺点：可读性难度加大，不够优雅
 *
 * @author Fawda liuyl @since 1.0
 **/
public class LazyDoubleCheckSimplesingletion {
    private LazyDoubleCheckSimplesingletion() {}

    private volatile static LazyDoubleCheckSimplesingletion instance;

    public static LazyDoubleCheckSimplesingletion getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSimplesingletion.class) {
                if (instance == null) {//此处主要式volatile的可见性
                    instance = new LazyDoubleCheckSimplesingletion();
                    //指令重排序
                }
            }
        }
        return instance;
    }
}
