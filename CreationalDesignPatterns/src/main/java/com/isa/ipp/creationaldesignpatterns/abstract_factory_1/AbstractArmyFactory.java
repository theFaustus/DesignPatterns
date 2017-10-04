/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.abstract_factory_1;

import java.util.List;

/**
 *
 * @author Faust
 */
public abstract class AbstractArmyFactory {
    private static final WesterosArmyFactory WESTEROS_LAND = new WesterosArmyFactory();
    private static final FrozenArmyFactory FROZEN_LAND = new FrozenArmyFactory();
    
    public static AbstractArmyFactory getFactory(Race race) {
        AbstractArmyFactory factory = null;
        switch (race) {
            case WESTEROS:
                factory = WESTEROS_LAND;
                break;
            case FROZEN:
                factory = FROZEN_LAND;
                break;
        }
        return factory;
    }

    public abstract List<Horse> createHorses();

    public abstract List<Soldier> createSoldiers();
}
