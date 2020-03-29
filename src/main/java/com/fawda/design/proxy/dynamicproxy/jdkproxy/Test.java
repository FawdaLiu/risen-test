package com.fawda.design.proxy.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import javax.tools.ToolProvider;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <b>时间:</b> <i>2020-03-03 00:21</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.dynamicproxy.jdkproxy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        IPerson instance = new JdkMeiPo().getInstance(new ZhaoLiu());
        instance.findLove("Zhangsan要求：肤白貌美大长腿！", 10);

    byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D://$Proxy0.class");
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*IPerson zhaoLiu = jdkMeipo.getInstance(new ZhaoLiu());
        zhangsan.findLove();*/
    }
}
