package com.fawda.design.builder;

import java.util.ArrayList;

/**
 * <b>时间:</b> <i>2020-03-01 18:21</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.builder}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BmwBuilder bmwBuilder = new BmwBuilder();
    private BenzBuilder benzBuilder = new BenzBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("satrt");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("satrt");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    public BmwModel getABmwModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("satrt");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BmwModel)this.bmwBuilder.getCarModel();
    }
    public BmwModel getBBmwModel() {
        this.sequence.clear();
        this.sequence.add("satrt");
        this.benzBuilder.setSequence(this.sequence);
        return (BmwModel)this.bmwBuilder.getCarModel();
    }
}
