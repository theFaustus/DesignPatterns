/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.mediator;

/**
 *
 * @author Faust
 */
public class Helicopter  extends Transport{

    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void send(String m) {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.mediator.Helicopter.send() - " + m );
        s.send(name, m);
    }

    @Override
    public void receive(String from, String m) {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.mediator.Helicopter.receive() - " + m + " from " + from);
    }
    
}
