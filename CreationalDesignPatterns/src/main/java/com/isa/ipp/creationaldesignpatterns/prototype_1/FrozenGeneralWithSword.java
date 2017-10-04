/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.prototype_1;

/**
 *
 * @author ipascari
 */
public class FrozenGeneralWithSword implements FrozenGeneral{
    private String name = "Frozen Sword General";

    @Override
    public FrozenGeneral clone() {
        return new FrozenGeneralWithSword();
    }

    @Override
    public String getName() {
        return name;
    }
    
}
