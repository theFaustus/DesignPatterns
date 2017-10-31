/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.strategy;

/**
 *
 * @author Faust
 */
public class TCP implements Protocol {

    @Override
    public void transfer() {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.strategy.TCP.transfer()");
    }

}
