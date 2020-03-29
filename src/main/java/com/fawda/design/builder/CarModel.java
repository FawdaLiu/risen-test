package com.fawda.design.builder;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * <b>时间:</b> <i>2020-03-01 17:54</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.builder}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public abstract class CarModel {
    private ArrayList<String> arrayList = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        for (int i = 0; i < arrayList.size(); i++) {
            String s = this.arrayList.get(i);
            if (s.equalsIgnoreCase("start")) {
                this.start();
            } else if (s.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (s.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (s.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    public final void setSequence(ArrayList sequence) {
        this.arrayList = sequence;
    }
}
