package com.gupaoedu.vip.design.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * Created by Tom.
 */
public class ConnectionPool {

    private Vector<ConnectionInfo> pool;

    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";
    private int poolSize = 100;

    public ConnectionPool() {
        pool = new Vector<ConnectionInfo>();

        try{
            Class.forName(driverClassName);
            for (int i = 0; i < poolSize; i++) {
                Connection conn = DriverManager.getConnection(url,username,password);
                pool.add(new ConnectionInfo(conn));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public synchronized Connection getConnection(){
        if(pool.size() > 0){
            ConnectionInfo connectionInfo = pool.get(0);
            pool.remove(connectionInfo);
            return connectionInfo.getConnection();
        }
        return null;
    }

    public synchronized void release(Connection conn){
        pool.add(new ConnectionInfo(conn));
    }
}
