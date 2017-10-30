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
public class FrozenGeneralWithSpear implements FrozenGeneral {

    private String name;

    public FrozenGeneralWithSpear(String name) {
        this.name = name;
    }

    @Override
    public FrozenGeneral clone() {
        return new FrozenGeneralWithSpear(name);
    }

    @Override
    public String getName() {
        return name;
    }

}
