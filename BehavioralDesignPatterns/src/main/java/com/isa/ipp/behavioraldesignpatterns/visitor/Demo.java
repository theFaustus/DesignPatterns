/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.visitor;

/**
 *
 * @author Faust
 */
public class Demo {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.add(new Adult());
        b.add(new Adult());
        b.add(new Adult());
        b.add(new Adult());
        b.add(new Teenager());
        b.add(new Teenager());
        b.add(new Teenager());
        b.add(new Teenager());
        TaxVisitor t = new TaxVisitor();
        b.visitPassenger(t);
    }
}
