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
public class AdditionExpression implements Expression {

    private Expression e1;
    private Expression e2;

    public AdditionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public int evaluate() {
        return e1.evaluate() + e2.evaluate();
    }

}
