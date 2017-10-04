/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.abstract_factory_2;

/**
 *
 * @author Faust
 */
public class Assassin implements Cloneable{
    public String credo;
    
    public Assassin(String credo){
        this.credo = credo;
    }

    @Override
    protected Assassin clone(){
        Assassin clone = null;
        try{
            clone = (Assassin) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    
    
}
