/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.proxy;

/**
 *
 * @author Faust
 */
public class Demo {
    public static void main(String[] args) {
        ThreadSafeList<Integer> list = new ThreadSafeList<>();
        list.add(5);
        list.add(7);
        list.remove(5);
    }
}
