/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faust
 */
public class Report {

    private String data;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setData(String d) {
        this.data = d;
        notifyObservers();

    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }
}
