/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faust
 */
public class Folder extends File {

    private List<File> files = new ArrayList<>();
    private String encryption;

    public Folder(String encryption, String name, String attributes) {
        super(name, attributes);
        this.encryption = encryption;
    }

    public void addFile(File f) {
        files.add(f);
    }

    public void removeFile(File f) {
        files.remove(f);
    }

    @Override
    public String toString() {
        return "Folder{" + "name=" + name + ", attributes=" + attributes + ", files=" + files + ", encryption=" + encryption + '}';
    }

}
