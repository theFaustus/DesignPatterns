/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.abstract_factory_2;

/**
 *
 * @author Faust
 */
public class UnsulliedAssassin extends Assassin {

    public UnsulliedAssassin() {
        super("Great men never die!");
    }

    @Override
    protected Assassin clone() {
        return new UnsulliedAssassin();
    }
    
    
    
}
