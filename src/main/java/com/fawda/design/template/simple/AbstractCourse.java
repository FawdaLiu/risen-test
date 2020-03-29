package com.fawda.design.template.simple;

/**
 * <b>时间:</b> <i>2020-03-12 22:37</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.template}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public abstract class AbstractCourse {


    protected final void ceateCourse() {
        //1.发布预习资料
        postPreRsources();
        //2.制作课件
        ceatePPT();
        //3.在线直播授课
        liveVdeo();
        //4.课后资料上传
        postReoure();
        //5.布置作业
        postHomeWork();

        if (needChekhomeWork()) {
            checkHomeWork();
        }
    }

    protected abstract void checkHomeWork();

    protected boolean needChekhomeWork(){
        return false;
    };



    protected void postHomeWork(){
        System.out.println("发布预习资料");
    };

    protected void postReoure(){
        System.out.println("制作课件");
    };

    protected void liveVdeo(){
        System.out.println("在线直播授课");
    };

    protected void ceatePPT(){
        System.out.println("课后资料上传");
    };

    protected void postPreRsources(){
        System.out.println("布置作业");
    };

}
