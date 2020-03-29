package com.gupaoedu.vip.design.factory.factorymethod;

import com.gupaoedu.vip.design.factory.simplefactory.CourseFactory;
import com.gupaoedu.vip.design.factory.simplefactory.ICouse;
import com.gupaoedu.vip.design.factory.simplefactory.JavaCouse;

/**
 * <b>时间:</b> <i>2020-02-23 20:37</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.factory.simplefactory}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new PythonCourseFactory();
        ICouse iCouse = iCourseFactory.create();
        iCouse.record();
    }
}
