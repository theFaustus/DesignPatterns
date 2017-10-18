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
public class Demo {
    public static final int ROWS = 6, COLS = 10;
    
    public static void main(String[] args) {
        Factory f = new Factory(ROWS);
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                f.getFlyweight(i).print(j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
