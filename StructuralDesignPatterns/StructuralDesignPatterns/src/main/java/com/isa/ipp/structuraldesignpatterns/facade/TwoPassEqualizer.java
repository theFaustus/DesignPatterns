/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.facade;

/**
 *
 * @author Faust
 */
public class TwoPassEqualizer extends Equalizer {

    @Override
    public void setHigh() {
        System.out.println("[TwoPassEqualizer] setHigh");
    }

    @Override
    public void setMid() {
        System.out.println("[TwoPassEqualizer] setMid");
    }

    @Override
    public void setLow() {
        System.out.println("[TwoPassEqualizer] setLow");
    }

}
