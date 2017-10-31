/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.interpreter;

/**
 *
 * @author Faust
 */
public class IntegerExpression implements Expression {

    private int value;

    public IntegerExpression(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

}
