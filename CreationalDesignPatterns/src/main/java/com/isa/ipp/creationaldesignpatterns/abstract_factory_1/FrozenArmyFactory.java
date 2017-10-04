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
public class FrozenArmyFactory extends AbstractArmyFactory{

    @Override
    public List<Horse> createHorses() {
        System.out.println("Frozen horses on the ground (Abstract Factory).");
       return Arrays.asList(new FrozenHorse(), new FrozenHorse()); 
    }

    @Override
    public List<Soldier> createSoldiers() {
        System.out.println("Frozen soldiers on the ground (Abstract Factory).");
        return Arrays.asList(new FrozenSoldier(), new FrozenSoldier());
    }
    
}
