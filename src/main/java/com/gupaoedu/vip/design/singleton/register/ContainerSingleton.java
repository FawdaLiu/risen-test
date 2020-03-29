package com.gupaoedu.vip.design.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <b>时间:</b> <i>2020-02-26 22:04</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.singleton.register}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {
        if (!ioc.containsKey(className)) {
            synchronized (ioc) {
                if (!ioc.containsKey(className)) {
                    try {
                        ioc.put(className, Class.forName(className).newInstance());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return ioc.get(className);
        }
        return ioc.get(className);
    }
    /*public static Object getInstance(String className) {
        return ioc.computeIfAbsent(className, s -> {
            try {
                return Class.forName(s).newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }*/
}
