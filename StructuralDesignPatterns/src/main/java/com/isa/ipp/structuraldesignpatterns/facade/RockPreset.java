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
public class RockPreset implements Preset {

    @Override
    public void apply() {
        HighPassFlanger flanger = new HighPassFlanger();
        Echo e = new Echo();
        TwoPassEqualizer equalizer = new TwoPassEqualizer();
        flanger.setValue();
        e.set();
        equalizer.setHigh();
        System.out.println("Rock preset applied.");
    }

}
