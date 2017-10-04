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
public class UnsulliedAssassinFactory extends AbstractAssassinFactory {

    public UnsulliedAssassinFactory() {
        prototype = new UnsulliedAssassin();
        System.out.println("Unsullied on the ground (Abstract Factory)");
    }

}
