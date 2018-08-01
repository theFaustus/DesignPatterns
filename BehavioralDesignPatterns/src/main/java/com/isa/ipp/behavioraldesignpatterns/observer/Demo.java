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
public class Demo {

    public static void main(String[] args) {
        TwoDimensionalGraph twoDimensionalGraph = new TwoDimensionalGraph();
        ThreeDimensionalGraph threeDimensionalGraph = new ThreeDimensionalGraph();

        Report report = new Report();
        report.addObserver(twoDimensionalGraph);
        report.addObserver(threeDimensionalGraph);
        report.setData("X=1,Y=2");

    }
}
