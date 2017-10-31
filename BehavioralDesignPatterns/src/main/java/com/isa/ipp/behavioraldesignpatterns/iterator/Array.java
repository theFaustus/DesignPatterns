/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faust
 */
public class Array<T> implements Collection<T> {

    private List<T> array;
    private int position = 0;

    public Array(int size) {
        array = new ArrayList<>(size);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(array, position);
    }

    @Override
    public void add(T element) {
        array.add(position++, element);
    }

    @Override
    public int getLength() {
        return position;
    }

}
