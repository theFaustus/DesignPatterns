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
public class Demo {

    public static void main(String[] args) {
        FileStream stream = new FileStream();
        CompressedStream cs = new CompressedStream(stream);
        EncryptedStream es = new EncryptedStream(cs);
        es.write();
        es.read();
    }
}
