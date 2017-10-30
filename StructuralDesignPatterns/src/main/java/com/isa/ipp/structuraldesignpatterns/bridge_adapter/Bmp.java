/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.bridge_adapter;

import com.isa.ipp.structuraldesignpatterns.bridge.*;

/**
 *
 * @author Faust
 */
public class Bmp extends Image {

    @Override
    public void init() {
        System.out.println("com.isa.ipp.structuraldesignpatterns.bridge_adapter.Bmp.init()");
        platform.draw();
    }

}
