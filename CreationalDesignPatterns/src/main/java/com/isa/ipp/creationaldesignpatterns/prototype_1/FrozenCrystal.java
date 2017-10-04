/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.prototype_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ipascari
 */
public class FrozenCrystal {

    private static List<FrozenGeneral> generals = new ArrayList<>();

    public static void addGeneral(FrozenGeneral g) {
        generals.add(g);
    }

    public static FrozenGeneral createGeneral(String name) {
        for (FrozenGeneral general : generals) {
            if (general.getName().equals(name)) {
                System.out.println(name + " on the ground (Prototype).");
                return general.clone();

            }
        }
        return null;
    }
}
