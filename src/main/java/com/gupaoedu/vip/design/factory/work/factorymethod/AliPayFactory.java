package com.gupaoedu.vip.design.factory.work.factorymethod;

import com.gupaoedu.vip.design.factory.work.factorymethod.IPay;

/**
 * <b>时间:</b> <i>2020-02-24 01:30</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.factory.work.factorymethod}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class AliPayFactory implements IPayFactory {
    @Override
    public IPay getInstance() {
        return new AliPay();
    }
}
