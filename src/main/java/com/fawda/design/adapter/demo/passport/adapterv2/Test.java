package com.fawda.design.adapter.demo.passport.adapterv2;

import com.fawda.design.adapter.demo.passport.ResultMsg;
import com.fawda.design.adapter.demo.passport.adapterv2.adapters.LoginForQQAdapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter(new LoginForQQAdapter());
        ResultMsg sdfasdfasfasfas = adapter.loginForThird("sdfasdfasfasfas");
        System.out.println(sdfasdfasfasfas);
    }
}
