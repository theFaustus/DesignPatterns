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
public class Demo {

    public static void main(String[] args) {
        App app = new App();
        app.setState(new LoggedOutState());
        app.performOperation("Help");
        app.logIn("Jack");
        app.setState(new LoggedInState());
        app.logIn("Jack");
        app.logOut("Jack");
    }
}
