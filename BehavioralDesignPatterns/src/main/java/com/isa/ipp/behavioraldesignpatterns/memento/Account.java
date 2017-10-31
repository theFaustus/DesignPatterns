/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.memento;

/**
 *
 * @author Faust
 */
public class Account {

    private double balance;

    public void deposit(double a) {
        balance += a;
        System.out.println("com.isa.ipp.behavioraldesignpatterns.memento.Account.deposit() +" + a);
        System.out.println(balance);
    }

    public void withdraw(double a) {
        balance -= a;
        System.out.println("com.isa.ipp.behavioraldesignpatterns.memento.Account.withdraw() -" + a);
        System.out.println(balance);
    }

    public Memento getMemento() {
        return new Memento(balance);
    }

    public void setMemento(Memento memento) {
        this.balance = memento.getBalance();
    }

}
