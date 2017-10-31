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
public interface State {

    void performOperation(String d);

    void logIn(String d);

    void logOut(String d);

}
