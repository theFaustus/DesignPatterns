/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.memento;

import java.util.Stack;

/**
 *
 * @author Faust
 */
public class CareTaker {
  private Stack<Memento> states = new Stack<>();

  public void saveMemento(Memento m) {
    states.push(m);
  }

  public Memento restoreMemento() {
    return states.pop();
  }
}

