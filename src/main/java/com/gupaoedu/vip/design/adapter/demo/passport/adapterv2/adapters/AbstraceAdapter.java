package com.gupaoedu.vip.design.adapter.demo.passport.adapterv2.adapters;

import com.gupaoedu.vip.design.adapter.demo.passport.PassportService;
import com.gupaoedu.vip.design.adapter.demo.passport.ResultMsg;

/**
 * <b>修订原因:</b> 初始化创建.详细说明:<br>
 *       <br>
 *
 * <b>时间:</b> <i>2020年03月11日 0:42</i>
 *
 * @author liuyl@risencn.com
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
