package com.gupaoedu.vip.design.state.general.apply;

//具体状态类
public class ConcreteStateB extends State {
    @Override
    public void handle() {
        System.out.println("StateB do action");
    }
}