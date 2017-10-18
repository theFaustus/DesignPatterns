/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.bridge;

/**
 *
 * @author Faust
 */
public class Demo {
    public static void main(String[] args) {
        Image i = new Png();
        i.setPlatform(new Windows());
        i.init();
        i.setPlatform(new MacOs());
        i.init();
    }
    
}
