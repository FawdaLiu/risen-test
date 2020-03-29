package com.gupaoedu.vip.design.adapter.demo.passport.adapterv2;

import com.gupaoedu.vip.design.adapter.demo.passport.ResultMsg;

/**
 * <b>修订原因:</b> 初始化创建.详细说明:<br>
 *       <br>
 *
 * <b>时间:</b> <i>2020年03月11日 0:41</i>
 *
 * @author liuyl@risencn.com
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
