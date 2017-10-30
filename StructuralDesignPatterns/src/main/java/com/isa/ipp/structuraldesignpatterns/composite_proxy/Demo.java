/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.composite_proxy;

import com.isa.ipp.structuraldesignpatterns.composite.*;

/**
 *
 * @author Faust
 */
public class Demo {

    public static void main(String[] args) {
        Folder f = new Folder("DES", "Windows", "RW");
        f.addFile(new Folder("DES", "System32", "R"));
        
        Folder f2 = new Folder("DES", "C:/", "RW");
        f2.addFile(f);
        
        System.out.println(f2);
    }

}
