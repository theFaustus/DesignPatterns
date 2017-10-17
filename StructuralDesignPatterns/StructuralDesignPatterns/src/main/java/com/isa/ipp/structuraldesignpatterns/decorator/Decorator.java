/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.decorator;

/**
 *
 * @author Faust
 */
public abstract class Decorator implements Stream {
    Stream stream;

    public Decorator(Stream stream) {
        this.stream = stream;
        System.out.println("com.isa.ipp.structuraldesignpatterns.decorator.Decorator.<init>()");
    }

    @Override
    public void read() {
        stream.read();
        System.out.println("com.isa.ipp.structuraldesignpatterns.decorator.Decorator.read()");
    }

    @Override
    public void write() {
        stream.write();
        System.out.println("com.isa.ipp.structuraldesignpatterns.decorator.Decorator.write()");
    }

}
