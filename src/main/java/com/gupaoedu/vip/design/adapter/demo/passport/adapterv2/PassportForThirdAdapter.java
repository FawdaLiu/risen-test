package com.gupaoedu.vip.design.adapter.demo.passport.adapterv2;

import com.gupaoedu.vip.design.adapter.demo.passport.ResultMsg;
import com.gupaoedu.vip.design.adapter.demo.passport.adapterv2.adapters.ILoginAdapter;
import com.gupaoedu.vip.design.adapter.demo.passport.adapterv2.adapters.LoginForQQAdapter;
import com.gupaoedu.vip.design.adapter.demo.passport.adapterv2.adapters.LoginForTelAdapter;
import com.gupaoedu.vip.design.adapter.demo.passport.adapterv2.adapters.LoginForTokenAdapter;
import com.gupaoedu.vip.design.adapter.demo.passport.adapterv2.adapters.LoginForWechatAdapter;

/**
 * <b>修订原因:</b> 初始化创建.详细说明:<br>
 *       <br>
 *
 * <b>时间:</b> <i>2020年03月11日 0:42</i>
 *
 * @author liuyl@risencn.com
 */
public class PassportForThirdAdapter implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {

        return processLogin(openId, LoginForWechatAdapter.class);

    }

    @Override
    public ResultMsg loginForToken(String token) {

        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return processLogin(phone, LoginForTelAdapter.class);
    }


    private ResultMsg processLogin(String id,Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
