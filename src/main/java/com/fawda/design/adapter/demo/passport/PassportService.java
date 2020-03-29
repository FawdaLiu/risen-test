package com.fawda.design.adapter.demo.passport;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * <b>修订原因:</b> 初始化创建.详细说明:<br>
 *       <br>
 *
 * <b>时间:</b> <i>2020年03月11日 0:49</i>
 *
 * @author liuyl@risencn.com
 */
public class PassportService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password){
        return new ResultMsg(200, "登录成功", password.replaceAll("/\\w\\d/g", "*"));
    }

}
