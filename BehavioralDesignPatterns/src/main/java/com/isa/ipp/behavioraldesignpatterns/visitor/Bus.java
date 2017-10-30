/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faust
 */
public class Bus {

    List<Visitable> passengers = new ArrayList<>();

    public void visitPassenger(Visitor v) {
        for (Visitable passenger : passengers) {
            passenger.accept(v);
        }
    }

    public void add(Visitable v) {
        passengers.add(v);
    }
}
