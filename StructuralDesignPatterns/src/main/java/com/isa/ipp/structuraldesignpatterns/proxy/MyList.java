/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faust
 */
public class MyList<T> {
    private List<T> list = new ArrayList<>();
    
    public void add(T item){
        list.add(item);
        System.out.println("com.isa.ipp.structuraldesignpatterns.proxy.MyList.add()");
    }
    
    public void remove(T item){
        list.remove(item);
        System.out.println("com.isa.ipp.structuraldesignpatterns.proxy.MyList.remove()");
    }
    
}
