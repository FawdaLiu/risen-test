package com.gupaoedu.vip.design.template.jdbc;

import com.gupaoedu.vip.design.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
