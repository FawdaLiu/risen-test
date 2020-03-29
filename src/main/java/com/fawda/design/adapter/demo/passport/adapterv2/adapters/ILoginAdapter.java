package com.fawda.design.adapter.demo.passport.adapterv2.adapters;

import com.fawda.design.adapter.demo.passport.ResultMsg;

/**
 * <b>修订原因:</b> 初始化创建.详细说明:<br>
 *       <br>
 *
 * <b>时间:</b> <i>2020年03月11日 0:40</i>
 *
 * @author liuyl@risencn.com
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
