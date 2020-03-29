package com.fawda.design.template.homework;

/**
 * <b>时间:</b> <i>2020-03-12 22:45</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.template}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Test {
    public static void main(String[] args) {

        CourseProxy courseProxy = new CourseProxy(new JavaCourse());
        courseProxy.setNeedChekhomeWork(true);
        System.out.println();
        courseProxy.ceateCourse();

        courseProxy = new CourseProxy(new PythonCourse());
        courseProxy.ceateCourse();

    }
}
