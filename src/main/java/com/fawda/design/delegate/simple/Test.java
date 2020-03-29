package com.fawda.design.delegate.simple;

/**
 * <b>时间:</b> <i>2020-03-12 21:40</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.delegate.simple}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Test {

    public static void main(String[] args) {
        new Boss().commod("爬虫", new Leader());
        new Boss().commod("海报图", new Leader());
        new Boss().commod("销售", new Leader());
    }
}
