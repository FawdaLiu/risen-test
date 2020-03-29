package com.gupaoedu.vip.design.singleton.lazy;

/**
 * <b>时间:</b> <i>2020-02-26 21:34</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.singleton.lazy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * 优点:写法优雅，很好的利用了java的语法特点，性能高，避免了内存浪费
 * 缺点:不优雅
 *
 * @author Fawda liuyl @since 1.0
 **/
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton() {
        /*if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不允许非法构造");
        }*/
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

}
