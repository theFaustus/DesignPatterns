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
public class App {

    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void logIn(String d) {
        state.logIn(d);
    }

    public void logOut(String d) {
        state.logOut(d);
    }

    public void performOperation(String d) {
        state.performOperation(d);
    }
}
