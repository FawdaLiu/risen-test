package com.gupaoedu.vip.design.chain.auth.optimiaze;

import com.gupaoedu.vip.design.chain.auth.Member;

/**
 * Created by Tom.
 */
public abstract class Handler {
    protected Handler next;
    public void next(Handler next){ this.next = next;}

    public abstract void doHandler(Member member);
}
