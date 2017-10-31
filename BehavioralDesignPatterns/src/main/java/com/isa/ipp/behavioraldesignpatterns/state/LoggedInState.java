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
public class LoggedInState implements State {

    @Override
    public void performOperation(String d) {
        System.out.println("Operation : " + d);
    }

    @Override
    public void logIn(String d) {
        System.out.println("Log out first.");
    }

    @Override
    public void logOut(String d) {
        System.out.println("Logged out.");
    }

}
