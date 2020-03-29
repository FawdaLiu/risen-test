package com.fawda.design.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <b>时间:</b> <i>2020-03-06 00:25</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.decorator}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class BasicsPageSign implements PageSign {

    @Override
    public List<String> getPageSign() {
        return new ArrayList<String>(Arrays.asList("问答","文档", "精品课", "冒泡", "商城"));
    }
}
