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
public class DataTransfer {

    private Protocol p;

    public void setP(Protocol p) {
        this.p = p;
    }

    public void sendStream() {
        if (p != null) {
            p.transfer();
        }
    }

}
