/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.singleton_3;

/**
 *
 * @author Faust
 */
public enum DrogonDragon {
    INSTANCE;
    
    public void breathFire(){
        System.out.println("DrogonDragon (Singleton) : Fire!!!");
    }
}
