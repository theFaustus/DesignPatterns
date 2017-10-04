/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.factory_method_1;

/**
 *
 * @author ipascari
 */
public class ElfBlacksmith implements Blacksmith {

    public ElfBlacksmith() {
    }

    @Override
    public void forgeWeapons() {
        System.out.println("Elf weapons forged. (Factory Method)");
    }
    
}
