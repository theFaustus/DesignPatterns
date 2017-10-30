/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.composite_proxy;

import com.isa.ipp.structuraldesignpatterns.proxy.*;

/**
 *
 * @author Faust
 */
public class ThreadSafeList<T> {

    private MyList<T> list = new MyList<>();
    private Object monitor = new Object();

    public void add(T item) {
        System.out.println("com.isa.ipp.structuraldesignpatterns.composite_proxy.ThreadSafeList.add()");
        synchronized (monitor) {
            list.add(item);
        }
    }

    public void remove(T item) {
        System.out.println("com.isa.ipp.structuraldesignpatterns.composite_proxy.ThreadSafeList.remove()");
        synchronized (monitor) {
            list.remove(item);
        }
    }

    @Override
    public String toString() {
        return "ThreadSafeList{" + "list=" + list + '}';
    }

}
