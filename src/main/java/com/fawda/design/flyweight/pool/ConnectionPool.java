package com.fawda.design.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * <b>时间:</b> <i>2020-03-08 23:03</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.flyweight.pool}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class ConnectionPool {
    private String url = "jdbc:mysql://db.risencn.com:3306/risen_zdbyc_gsq?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private String userName = "risen_zdbyc_gsq";
    private String password = "risen_zdbyc_gsq";

    private int poolSize = 10;

    private Vector<ConnectionInfo> pool;

    public ConnectionPool() {
        pool = new Vector<ConnectionInfo>();
        try {
            Class.forName(driverClassName);
            for (int i = 0; i < poolSize; i++) {
                Connection connection = DriverManager.getConnection(url, userName, password);
                pool.add(new ConnectionInfo(connection));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public synchronized ConnectionInfo getConnection() {
        if (pool.size() > 0) {
            ConnectionInfo connectionInfo = pool.get(0);
            connectionInfo.setActive(true);
            connectionInfo.setRelease(false);
            pool.remove(connectionInfo);
            return connectionInfo;
        }
        return null;
    }

    public synchronized void release(ConnectionInfo conn) {
        conn.setActive(false);
        conn.setRelease(true);
        pool.add(conn);
    }
}
