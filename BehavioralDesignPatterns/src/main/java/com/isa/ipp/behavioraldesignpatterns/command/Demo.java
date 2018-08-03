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
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        Widget w = new Widget();
        w.setListener(new PlayMusicCommand(player));
        w.clickPlayButton();
    }
}
