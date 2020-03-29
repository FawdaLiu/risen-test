package com.fawda.design.flyweight.pool;

import java.sql.Connection;

/**
 * <b>时间:</b> <i>2020-03-08 23:12</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.flyweight.pool}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        for (int i = 0; i < 15; i++) {
            ConnectionInfo conn = connectionPool.getConnection();
            System.out.format("isActive:%s, isRelease:%s;", conn.isActive(), conn.isRelease());
            connectionPool.release(conn);
            System.out.format("isActive:%s, isRelease:%s; conn:%s", conn.isActive(), conn.isRelease(), conn.getConnection());
            System.out.println();
        }
    }
}
