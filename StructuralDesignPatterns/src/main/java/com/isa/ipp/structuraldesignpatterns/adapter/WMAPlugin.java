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
public class WMAPlugin extends Plugin{

    @Override
    public void decode() {
        System.out.println("[WMAPlugin] Decode");
    }
    
    
}
