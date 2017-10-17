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
public class PDF extends File {

    private String version;

    public PDF(String version, String name, String attributes) {
        super(name, attributes);
        this.version = version;
    }

    @Override
    public String toString() {
        return "PDF{" + "name=" + name + ", attributes=" + attributes + ", version=" + version + '}';
    }

}
