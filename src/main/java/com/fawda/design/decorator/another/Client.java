package com.fawda.design.decorator.another;

/**
 * <b>时间:</b> <i>2020-03-06 01:22</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.decorator.another}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        DefaultMenu defaultMenu = new DefaultMenu();
        StringBuffer stringBuffer = new StringBuffer();
        for (MenuEnum menu : defaultMenu.getMenu()) {
            stringBuffer.append(menu.getMenuName()).append(",");
        }
        System.out.println(stringBuffer.toString());
        stringBuffer = new StringBuffer();
        LoginDecoratorMenu loginMenu = new LoginDecoratorMenu(defaultMenu);
        for (MenuEnum menu : loginMenu.getMenu()) {
            stringBuffer.append(menu.getMenuName()).append(",");
        }
        System.out.println(stringBuffer.toString());
        stringBuffer = new StringBuffer();
        AdminDecoratorMenu adminMenu = new AdminDecoratorMenu(loginMenu);
        for (MenuEnum menu : adminMenu.getMenu()) {
            stringBuffer.append(menu.getMenuName()).append(",");
        }
        System.out.println(stringBuffer.toString());

    }
}
