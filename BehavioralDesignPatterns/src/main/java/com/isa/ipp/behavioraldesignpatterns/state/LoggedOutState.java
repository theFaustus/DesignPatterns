/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.state;

/**
 *
 * @author Faust
 */
public class LoggedOutState implements State {

    @Override
    public void performOperation(String d) {
        System.out.println("You can not perform operation. Log in.");
    }

    @Override
    public void logIn(String d) {
        System.out.println("Logged in.");
    }

    @Override
    public void logOut(String d) {
        System.out.println("Log in first.");
    }

}
