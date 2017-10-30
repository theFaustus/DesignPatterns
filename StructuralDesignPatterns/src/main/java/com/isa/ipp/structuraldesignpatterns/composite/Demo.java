/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.composite;

/**
 *
 * @author Faust
 */
public class Demo {

    public static void main(String[] args) {
        Folder f = new Folder("RSA", "My Documents", "RW");
        f.addFile(new PDF("2", "Java_9.pdf", "R"));
        
        Folder f2 = new Folder("RSA", "Users", "RW");
        f2.addFile(f);
        f2.addFile(new PDF("3", "Learn IT", "R"));
        
        System.out.println(f2);
    }

}
