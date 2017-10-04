/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.demos;

import com.isa.ipp.creationaldesignpatterns.abstract_factory_1.AbstractArmyFactory;
import com.isa.ipp.creationaldesignpatterns.abstract_factory_1.Race;
import com.isa.ipp.creationaldesignpatterns.abstract_factory_2.AbstractAssassinFactory;
import com.isa.ipp.creationaldesignpatterns.abstract_factory_2.DothrakiAssassinFactory;
import com.isa.ipp.creationaldesignpatterns.abstract_factory_2.UnsulliedAssassinFactory;
import com.isa.ipp.creationaldesignpatterns.singleton_1.RhaegalDragon;
import com.isa.ipp.creationaldesignpatterns.singleton_3.DrogonDragon;
import com.isa.ipp.creationaldesignpatterns.singleton_2.ViserionDragon;

/**
 *
 * @author Faust
 */
public class GameOfThrones {

    public static void main(String[] args) {
        AbstractArmyFactory armyFactory = AbstractArmyFactory.getFactory(Race.FROZEN);
        armyFactory.createHorses();
        armyFactory.createSoldiers();
        armyFactory = AbstractArmyFactory.getFactory(Race.WESTEROS);
        armyFactory.createHorses();
        armyFactory.createSoldiers();
        AbstractAssassinFactory assassinFactory = new DothrakiAssassinFactory();
        assassinFactory.createAssassin();
        assassinFactory = new UnsulliedAssassinFactory();
        assassinFactory.createAssassin();
        DrogonDragon.INSTANCE.breathFire();
        RhaegalDragon.getInstance().breathFire();
        ViserionDragon.INSTANCE.breathFire();
    }
}
