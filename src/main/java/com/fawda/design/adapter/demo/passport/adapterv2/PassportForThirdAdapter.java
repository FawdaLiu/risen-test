package com.fawda.design.adapter.demo.passport.adapterv2;

import com.fawda.design.adapter.demo.passport.ResultMsg;
import com.fawda.design.adapter.demo.passport.adapterv2.adapters.ILoginAdapter;
import com.fawda.design.adapter.demo.passport.adapterv2.adapters.LoginForQQAdapter;
import com.fawda.design.adapter.demo.passport.adapterv2.adapters.LoginForTelAdapter;
import com.fawda.design.adapter.demo.passport.adapterv2.adapters.LoginForTokenAdapter;
import com.fawda.design.adapter.demo.passport.adapterv2.adapters.LoginForWechatAdapter;

/**
 * <b>修订原因:</b> 初始化创建.详细说明:<br>
 *       <br>
 *
 * <b>时间:</b> <i>2020年03月11日 0:42</i>
 *
 * @author liuyl@risencn.com
 */
public class PassportForThirdAdapter implements IPassportForThird {

    private ILoginAdapter loginAdapter;

    public PassportForThirdAdapter(ILoginAdapter loginAdapter) {
        this.loginAdapter = loginAdapter;
    }

    @Override
    public ResultMsg loginForThird(String key) {
        return processLogin(key);
    }

    private ResultMsg processLogin(String id){
        try {
            if (this.loginAdapter.support(this.loginAdapter)){
                return this.loginAdapter.login(id,this.loginAdapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
