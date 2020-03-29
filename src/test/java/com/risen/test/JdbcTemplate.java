package com.risen.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <b>时间:</b> <i>2020-03-29 13:11</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.risen.test}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class JdbcTemplate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://db.risencn.com:3306/risenpt_hzrisen_develop?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull", "risenpt_hzrisen_develop", "risenpt_hzrisen_develop");
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet tables = metaData.getTables(null, "%", "%", new String[]{"TABLE"});
            while (tables.next()) {
                String table_name = tables.getString("TABLE_NAME");
                String column_name;
                String type_name;
                ResultSet columns = metaData.getColumns(null, "%", table_name, "%");
                while (columns.next()) {
                    column_name = columns.getString("COLUMN_NAME");
                    type_name = columns.getString("TYPE_NAME");
                    System.out.println(column_name + "  " + type_name);
                }
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
