/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.observer;

/**
 *
 * @author Faust
 */
public class TwoDimensionalGraph implements Observer {

    @Override
    public void update(String data) {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.observer.TwoDimensionalGraph.update() - " + data);
    }

}
