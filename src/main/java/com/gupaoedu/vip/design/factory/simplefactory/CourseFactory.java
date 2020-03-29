package com.gupaoedu.vip.design.factory.simplefactory;

/**
 * <b>时间:</b> <i>2020-02-23 20:41</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.factory.simplefactory}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class CourseFactory {
    public ICouse create(Class<? extends ICouse> clazz){
        /*if ("java".equals(name)) {
            return new JavaCouse();
        } else if ("python".equals(name)) {
            return new PythonCouse();
        }*/
        /*if (!(null == className || "".equals(className))) {
            try {
                return (ICouse)Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }*/

        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
