package com.fawda.design.flyweight.pool;

import java.sql.Connection;

/**
 * <b>时间:</b> <i>2020-03-08 23:43</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.gupaoedu.vip.design.flyweight.pool}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class ConnectionInfo {

    private Connection conn;
    private boolean isActive = false;
    private boolean isRelease = false;

    public ConnectionInfo(Connection conn) {
        this.conn = conn;
    }

    public Connection getConnection() {
        return this.conn;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isRelease() {
        return isRelease;
    }

    public void setRelease(boolean release) {
        isRelease = release;
    }
}
