package com.fawda.design.decorator.another;

/**
 * <b>时间:</b> <i>2020-03-06 01:08</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.decorator.another}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public enum MenuEnum {
    WENDA("问答"),
    WENZHANG("文章"),
    ZUOYE("作业"),
    TIKU("题库"),
    CHENGZHANGQIANG("成长墙"),
    JINGPINKE("精品课"),
    MAOPAO("冒泡"),
    SHANGCHENG("商城"),
    GUANLIYUAN("管理员");

    private String menuName;

    MenuEnum(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }


}
