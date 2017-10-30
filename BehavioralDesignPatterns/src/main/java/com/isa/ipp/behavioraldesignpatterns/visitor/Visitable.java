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
public interface Visitable {
    void accept(Visitor v);
}
