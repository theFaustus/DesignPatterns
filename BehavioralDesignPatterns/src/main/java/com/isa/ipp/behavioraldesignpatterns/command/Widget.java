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
public class Widget {
    private CommandListener l;

    public void setListener(CommandListener l) {
        this.l = l;
    }

    public void clickPlayButton(){
        System.out.println("com.isa.ipp.behavioraldesignpatterns.command.Widget.clickPlayButton()");
        l.execute();
    }
    
}
