package com.gupaoedu.vip.design.command.player.actions;

//import com.gupaoedu.vip.pattern.command.player.GPlayer;
//import com.gupaoedu.vip.pattern.command.player.IAction;

import com.gupaoedu.vip.design.command.player.GPlayer;
import com.gupaoedu.vip.design.command.player.IAction;

/**
 * Created by Tom.
 */
public class PauseAction implements IAction {
    private GPlayer gplayer;

    public PauseAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.pause();
    }
}
