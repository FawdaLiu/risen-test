package com.gupaoedu.vip.design.command.player.actions;


import com.gupaoedu.vip.design.command.player.GPlayer;
import com.gupaoedu.vip.design.command.player.IAction;

/**
 * Created by Tom.
 */
public class StopAction implements IAction {
    private GPlayer gplayer;

    public StopAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.stop();
    }
}
