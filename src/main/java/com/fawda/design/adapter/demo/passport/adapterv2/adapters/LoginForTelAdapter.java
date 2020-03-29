package com.fawda.design.adapter.demo.passport.adapterv2.adapters;

import com.fawda.design.adapter.demo.passport.ResultMsg;

/**
 * <b>修订原因:</b> 初始化创建.详细说明:<br>
 *       <br>
 *
 * <b>时间:</b> <i>2020年03月11日 0:41</i>
 *
 * @author liuyl@risencn.com
 */
public class LoginForTelAdapter extends AbstraceAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        return super.loginForRegist(id,null);
    }

}
