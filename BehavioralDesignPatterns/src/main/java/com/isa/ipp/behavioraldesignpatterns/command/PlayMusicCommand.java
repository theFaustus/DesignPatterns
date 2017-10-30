/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.command;

/**
 *
 * @author Faust
 */
public class PlayMusicCommand implements CommandListener {
    Player p;

    public PlayMusicCommand(Player p) {
        this.p = p;
    }
    
    @Override
    public void execute() {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.command.PlayMusicCommand.execute()");
        p.playAudio();
    }

}
