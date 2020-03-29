package com.fawda.design.proxy.dynamicproxy.gpproxy.client;

import com.fawda.design.proxy.dynamicproxy.gpproxy.proxy.GpClassLoader;
import com.fawda.design.proxy.dynamicproxy.gpproxy.proxy.GpInvocationHandler;
import com.fawda.design.proxy.dynamicproxy.gpproxy.proxy.GpProxy;

import java.lang.reflect.Method;

/**
 * <b>时间:</b> <i>2020-03-04 22:20</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.dynamicproxy.gpproxy.client}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class GpMeipo implements GpInvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        return (IPerson)GpProxy.newProxyInstance(new GpClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return null;
    }

    private void after() {
        System.out.println("双方同意，开始交往");
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }
}
