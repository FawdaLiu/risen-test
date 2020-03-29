package com.gupaoedu.vip.design.singleton.seriable;

import java.io.Serializable;

/**
 * <b>时间:</b> <i>2020-02-26 22:21</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.singleton.seriable}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class SeriableSingleton implements Serializable {
    private SeriableSingleton(){};
    private final static SeriableSingleton instance = new SeriableSingleton();

    public static SeriableSingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
