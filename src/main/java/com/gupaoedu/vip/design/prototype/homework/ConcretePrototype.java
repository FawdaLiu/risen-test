package com.gupaoedu.vip.design.prototype.homework;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

/**
 * <b>时间:</b> <i>2020-03-01 16:21</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.prototype.homework}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
@Data
public class ConcretePrototype {

    private int age;
    private String name;
    private List<String> hobbis;


    public ConcretePrototype jsonDeepClone() {
        String s = JSON.toJSONString(this);
        return JSONObject.parseObject(s, ConcretePrototype.class);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbis=" + hobbis +
                '}';
    }
}
