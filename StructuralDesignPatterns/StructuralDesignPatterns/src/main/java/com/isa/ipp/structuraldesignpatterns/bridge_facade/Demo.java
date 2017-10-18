/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.bridge_facade;

import com.isa.ipp.structuraldesignpatterns.facade.*;

/**
 *
 * @author Faust
 */
public class Demo {

    public static void main(String[] args) {
        AudioPlayer a = new AudioPlayer();
        a.setP(new MacOs());
        a.setPreset(new RockPreset());
        a.applyPreset();
        a.play();
        System.out.println();
        AudioPlayer b = new AudioPlayer();
        b.setP(new Windows());
        b.setPreset(new RockPreset());
        b.applyPreset();
        b.play();
    }
}
