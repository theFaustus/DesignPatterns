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
public class DothrakiAssassin extends Assassin{

    public DothrakiAssassin() {
        super("Dothraki`s tail is the pride!");
    }

    @Override
    protected Assassin clone() {
        return new DothrakiAssassin(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
