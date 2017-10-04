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
public class ValeryianBlacksmith implements Blacksmith {

    public ValeryianBlacksmith() {
    }

    @Override
    public void forgeWeapons() {
        System.out.println("Valeryian weapons forged. (Factory Method)");
    }

}
