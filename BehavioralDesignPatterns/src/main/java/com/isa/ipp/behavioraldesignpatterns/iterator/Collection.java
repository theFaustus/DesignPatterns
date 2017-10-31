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
public interface Collection<T> {
    Iterator createIterator();
    void add(T element);
    int getLength();
}
