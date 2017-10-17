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
public class AudioPlayer {
    Preset preset;
    
    public void setPreset(Preset p){
        preset = p;
    }
    
    public void applyPreset() {
        preset.apply();
    }
    
    public void play() {
        System.out.println("[AudioPlayer] Playing...");
    }
}
