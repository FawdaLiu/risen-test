package com.gupaoedu.vip.design.buillder.test;

/**
 * <b>时间:</b> <i>2020-03-01 23:40</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.buillder.test}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public abstract class Builder {
    public abstract void setPart();//设置产品的不同部分，以获取不同的产品

    public abstract Product buildProduct();
}
