package com.fawda.design.adapter.demo.passport.adapterv2.adapters;

import com.fawda.design.adapter.demo.passport.ResultMsg;

/**
 * <b>时间:</b> <i>2020-03-11 08:53</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.adapter.demo.passport.adapterv2.adapters}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class TencentVideoAdapter extends AbstraceAdapter {
    @Override
    public boolean support(Object object) {
        return false;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        return super.loginForRegist(id, null);
    }
}
