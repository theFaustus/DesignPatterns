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
public class EncryptedStream extends Decorator{

    public EncryptedStream(Stream stream) {
        super(stream);
    }

    @Override
    public void write() {
        encrypt();
        super.write(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void read() {
        encrypt();
        super.read(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void encrypt(){
        System.out.println("com.isa.ipp.structuraldesignpatterns.decorator.EncryptedStream.encrypt()");
    }
    
}
