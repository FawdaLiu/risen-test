package com.fawda.design.proxy.dynamicproxy.cglibproxy;

import com.fawda.design.proxy.dynamicproxy.jdkproxy.ZhangSan;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <b>时间:</b> <i>2020-03-01 20:37</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.dynamicproxy.jdkproxy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<ZhangSan> target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object o1 = methodProxy.invokeSuper(o, objects);
        after();
        return o1;
    }

    private void after() {
        System.out.println("双方同意，开始交往！");
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色！");
    }
}
