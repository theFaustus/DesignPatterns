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
public class Demo {
    public static void main(String[] args) {
        AudioPlayer a = new AudioPlayer();
        a.setPreset(new RockPreset());
        a.applyPreset();
        a.play();
    }
}
