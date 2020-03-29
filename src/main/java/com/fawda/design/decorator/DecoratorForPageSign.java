package com.fawda.design.decorator;

import java.util.List;

/**
 * <b>时间:</b> <i>2020-03-06 00:31</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.decorator}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public abstract class DecoratorForPageSign implements PageSign {

    private PageSign pageSign;

    public DecoratorForPageSign(PageSign pageSign) {
        this.pageSign = pageSign;
    }

    @Override
    public List<String> getPageSign() {
        return this.pageSign.getPageSign();
    }
}
