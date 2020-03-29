package com.fawda.design.proxy.dynamicproxy.cglibproxy;

import com.fawda.design.proxy.dynamicproxy.jdkproxy.ZhangSan;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * <b>时间:</b> <i>2020-03-01 22:01</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.dynamicproxy.cglibproxy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * cglib 集成的方式，覆盖父类的方法
 * jdk采用的实现的方式，必须要求代理的目标对象一定要实现一个接口
 *
 * 思想：都是通过生成字节码，重组成一个新的类
 *
 * JDK proxy 对于用户而言，依赖更强，调用也更加复杂
 * Cglib proxy 对目标类没有任何的要求
 *
 * cglib 效率更高，性能也更高，底层没有用到反射
 * jdk proxy 生成的逻辑较为简单，执行效率要低，每次都要用反射
 *
 * cglib 有个坑，目标代理类不能有final的方法，它会直接忽略。
 *
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "");
        ZhangSan instance = (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
        instance.findLove("", 1);
    }
}
