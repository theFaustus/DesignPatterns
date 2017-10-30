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
public class CompressedStream extends Decorator{

    public CompressedStream(Stream stream) {
        super(stream);
    }

    @Override
    public void write() {
        compress();
        super.write(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void read() {
        compress();
        super.read(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void compress(){
        System.out.println("com.isa.ipp.structuraldesignpatterns.decorator.CompressedStream.compress()");
    }
}
