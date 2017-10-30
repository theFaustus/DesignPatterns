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
public class TaxVisitor extends Visitor {

    @Override
    public void visitTeenager(Teenager t) {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.visitor.TaxVisitor.visitTeenager(). Fee = 3 lei.");
    }

    @Override
    public void visitAdult(Adult a) {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.visitor.TaxVisitor.visitAdult(). Fee = 5 lei.");
    }

}
