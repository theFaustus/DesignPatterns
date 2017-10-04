/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.singleton_1;

/**
 *
 * @author Faust
 */
public class RhaegalDragon {

    private static final RhaegalDragon INSTANCE = new RhaegalDragon();

    private RhaegalDragon() {
    }

    public static RhaegalDragon getInstance() {
        return INSTANCE;
    }

    public void breathFire() {
        System.out.println("RhaegalDragon (Singleton) : Fire!!!");
    }

}
