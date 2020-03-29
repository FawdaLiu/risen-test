package com.gupaoedu.vip.design.prototype.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>时间:</b> <i>2020-03-01 16:39</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.prototype.homework}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(20);
        concretePrototype.setName("fawda");
        List<String> objects = new ArrayList<>();
        objects.add("看书");
        objects.add("网球");
        concretePrototype.setHobbis(objects);
        ConcretePrototype concretePrototype1 = concretePrototype.jsonDeepClone();
        System.out.println(concretePrototype == concretePrototype1);
        concretePrototype1.getHobbis().add("111");
        System.out.println(concretePrototype.getHobbis());
        System.out.println(concretePrototype1.getHobbis());
    }
}
