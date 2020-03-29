package com.fawda.design.decorator.another;

import java.util.EnumSet;
import java.util.Set;

/**
 * <b>时间:</b> <i>2020-03-06 01:17</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.decorator.another}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class LoginDecoratorMenu extends DecoratorMenu {


    public LoginDecoratorMenu(AbstractMenu abstractMenu) {
        super(abstractMenu);
    }

    @Override
    public Set<MenuEnum> getMenu() {
        Set<MenuEnum> menu = super.getMenu();
        menu.addAll(EnumSet.of(MenuEnum.ZUOYE, MenuEnum.SHANGCHENG, MenuEnum.CHENGZHANGQIANG));
        return menu;
    }
}
