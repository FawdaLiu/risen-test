package com.fawda.design.proxy.staticproxy;

/**
 * <b>时间:</b> <i>2020-03-01 20:28</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.proxy.staticproxy}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class ZhangLaosan implements IPerson {

    public ZhangLaosan(Zhangsan zhangsan) {
        this.zhangsan = zhangsan;
    }

    private Zhangsan zhangsan;

    @Override
    public void findLove() {
        System.out.println("开始物色");
        zhangsan.findLove();
        System.out.println("开始交往");
    }
}
