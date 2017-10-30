/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.flyweight;

/**
 *
 * @author Faust
 */
public class Factory {

    private Item[] pool;

    public Factory(int howManyRows) {
        this.pool = new Item[howManyRows];
    }

    public Item getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Item(row);
        }
        return pool[row];
    }

}
