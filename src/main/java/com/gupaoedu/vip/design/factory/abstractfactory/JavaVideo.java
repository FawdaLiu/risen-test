package com.gupaoedu.vip.design.factory.abstractfactory;

/**
 * <b>时间:</b> <i>2020-02-23 21:26</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.factory.abstractfactory}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("java视频");
    }
}
