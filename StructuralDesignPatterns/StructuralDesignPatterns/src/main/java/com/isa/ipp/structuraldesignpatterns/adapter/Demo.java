/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.adapter;

/**
 *
 * @author Faust
 */
public class Demo {
    public static void main(String[] args) {
            AACAdapter adapter = new AACAdapter();
            WMAPlugin wmap = new WMAPlugin();
            PlayAAC(adapter);
            PlayAAC(wmap);
    
    }
    
    public static void PlayAAC(Plugin p){
        p.decode();
    }
}
