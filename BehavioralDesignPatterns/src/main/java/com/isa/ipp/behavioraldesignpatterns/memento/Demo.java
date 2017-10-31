/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.memento;

/**
 *
 * @author Faust
 */
public class Demo {

    public static void main(String[] args) {
        Account a = new Account();
        CareTaker careTaker = new CareTaker();
        a.deposit(578);
        careTaker.saveMemento(a.getMemento());
        a.deposit(789);
        careTaker.saveMemento(a.getMemento());
        a.withdraw(205);
        careTaker.saveMemento(a.getMemento());

        System.out.println("Transactions : ");
        System.out.println(careTaker.restoreMemento());
        System.out.println(careTaker.restoreMemento());
        System.out.println(careTaker.restoreMemento());
    }
}
