package com.fawda.design.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>时间:</b> <i>2020-03-12 21:36</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.delegate.simple}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Leader implements IEmployee {

    private Map<String, IEmployee> employee;

    public Leader() {
        employee = new HashMap<>();
        employee.put("爬虫", new EmployeeA());
        employee.put("海报图", new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if (!employee.containsKey(task)) {
            System.out.format("这个任务:%s超出我能力范围", task);
            return;
        }

        employee.get(task).doing(task);

    }
}
