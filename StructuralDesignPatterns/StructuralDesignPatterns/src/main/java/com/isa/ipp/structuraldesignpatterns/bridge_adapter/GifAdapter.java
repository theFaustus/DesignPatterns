/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.bridge_adapter;


/**
 *
 * @author Faust
 */
public class GifAdapter extends Image {

    private GifEncoder g = new GifEncoder();

    @Override
    public void init() {
        System.out.println("com.isa.ipp.structuraldesignpatterns.bridge_adapter.GifAdapter.init()");
        g.encode();
        platform.draw();
    }

}
