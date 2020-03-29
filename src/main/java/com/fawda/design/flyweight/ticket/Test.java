package com.fawda.design.flyweight.ticket;

/**
 * <b>时间:</b> <i>2020-03-08 22:53</i> 修订原因:初始化创建.详细说明:<br>
 * <br>
 * Action类{@linkplain com.fawda.design.flyweight.ticket}使用<br>
 *
 * <b>时间:</b> *年*月*日 *时*分*秒 修订原因:比如BUG修复或业务变更.详细说明:<br>
 *
 * @author Fawda liuyl @since 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicke("北京西", "长沙");
        ticket.showInfo("硬座");
        ticket = TicketFactory.queryTicke("北京西", "长沙");
        ticket.showInfo("软座");
        ticket = TicketFactory.queryTicke("北京西", "长沙");
        ticket.showInfo("硬卧");
    }
}
