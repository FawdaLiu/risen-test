package com.fawda.composite;

import com.gupaoedu.vip.design.buillder.test.Director;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>时间:</b> <i>2020-03-10 09:21</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.composite}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Folder extends Directory {

    private List<Director> directorList = new ArrayList<>();

    private String name;
    private String parentId;

    @Override
    public void showInfo() {

    }
}
