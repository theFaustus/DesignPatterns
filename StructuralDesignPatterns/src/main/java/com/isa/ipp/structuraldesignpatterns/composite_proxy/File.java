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
public abstract class File {
    protected String name;
    protected String attributes;

    public File(String name, String attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "File{" + "name=" + name + ", attributes=" + attributes + '}';
    }

    
}
