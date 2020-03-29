package com.gupaoedu.vip.design.chain.auth.optimiaze;

import com.gupaoedu.vip.design.chain.auth.Member;

/**
 * Created by Tom.
 */
public class LoginHandler extends Handler {
    public void doHandler(Member member) {
        System.out.println("登录成功！");
        member.setRoleName("管理员");
        next.doHandler(member);
    }
}
