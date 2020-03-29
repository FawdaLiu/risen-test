package com.fawda.design.proxy.dynamicproxy.gpproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <b>时间:</b> <i>2020-03-03 00:58</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.dynamicproxy.gpproxy.proxy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public interface GpInvocationHandler extends InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable ;
}
