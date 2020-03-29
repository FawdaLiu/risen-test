package com.fawda.design.commonds;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>时间:</b> <i>2020-03-29 01:17</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.chnmooc.core.ftp.commonds}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class FtpCommond {

    private static Map<String, ICommondAction> commondInstance = new HashMap<String, ICommondAction>();
    static {
        commondInstance.put(Commond.USER.comm, new UserAction());
        commondInstance.put(Commond.PASS.comm, new PassAction());
        commondInstance.put(Commond.QUIT.comm, new QuitAction());
        commondInstance.put(Commond.SYST.comm, new SystAction());
        commondInstance.put(Commond.PASV.comm, new PasvAction());
        commondInstance.put(Commond.EPSV.comm, new EpsvAction());
    }

    public ICommondAction getICommondActionByCommd(String commod) {
        if (commondInstance.containsKey(commod)) {
            return commondInstance.get(commod);
        }
        throw new IllegalArgumentException("无效指令：" + Commond.valueOf(commod).desc);
    }


    public enum Commond{
        USER("USER", "用户名"),
        PASS("PASS", "密码"),
        QUIT("QUIT", "退出"),
        SYST("SYST", "系统信息"),
        PASV("PASV", "请求服务器等待数据连接"),
        EPSV("EPSV", "....");

        private String comm;
        private String desc;

        Commond(String comm) {
            this.comm = comm;
        }

        Commond(String comm, String desc) {
            this.comm = comm;
            this.desc = desc;
        }
    }

}
