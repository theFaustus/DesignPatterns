/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.bridge_facade;

import com.isa.ipp.structuraldesignpatterns.bridge.*;

/**
 *
 * @author Faust
 */
public class MacOs extends Platform {

    @Override
    public void play() {
        System.out.println("com.isa.ipp.structuraldesignpatterns.bridge_facade.MacOs.play()");
    }

}