/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.visitor;

/**
 *
 * @author Faust
 */
public abstract class Visitor {
    public abstract void visitTeenager(Teenager t);
    public abstract void visitAdult(Adult a);
}
