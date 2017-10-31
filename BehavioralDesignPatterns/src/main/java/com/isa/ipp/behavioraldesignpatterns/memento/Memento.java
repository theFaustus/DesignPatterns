/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.memento;

/**
 *
 * @author Faust
 */
public class Memento {

    private double balance;

    public Memento(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Memento{" + "balance=" + balance + '}';
    }

}
