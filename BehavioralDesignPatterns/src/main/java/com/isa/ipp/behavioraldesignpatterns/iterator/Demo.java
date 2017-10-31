/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.iterator;

/**
 *
 * @author Faust
 */
public class Demo {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(10);
        arr.add(5);
        arr.add(2);
        arr.add(3);

        Iterator<Integer> it = arr.createIterator();
        it.first();
        System.out.println("Iterating...");
        while (it.hasNext()) {
            System.out.println(it.currentItem());
            it.next();
        }
        
    }
}
