/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.abstract_factory_1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Faust
 */
public class WesterosArmyFactory extends AbstractArmyFactory{

    @Override
    public List<Horse> createHorses() {
        System.out.println("Westeros horses on the ground (Abstract Factory).");
       return Arrays.asList(new WesterosHorse(), new WesterosHorse()); 
    }

    @Override
    public List<Soldier> createSoldiers() {
        System.out.println("Westeros soldiers on the ground (Abstract Factory).");
        return Arrays.asList(new WesterosSoldier(), new WesterosSoldier());
    }
    
}
