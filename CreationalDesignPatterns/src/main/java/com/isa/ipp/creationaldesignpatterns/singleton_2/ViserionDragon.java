/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.singleton_2;

/**
 *
 * @author Faust
 */
public class ViserionDragon {

    public static final ViserionDragon INSTANCE = new ViserionDragon();

    private ViserionDragon() {
    }
    
    public void breathFire(){
        System.out.println("ViserionDragon (Singleton) : Fire!!!");
    }
}
