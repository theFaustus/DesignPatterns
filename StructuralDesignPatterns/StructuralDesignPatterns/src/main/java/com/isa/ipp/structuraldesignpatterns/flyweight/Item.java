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
public class Item {
    private int row;

    public Item(int row) {
        this.row = row;
        System.out.println("Rows : " + row);
    }
    
    public void print(int col) {
        System.out.print(" " + row + col);
    }
    
    
}
