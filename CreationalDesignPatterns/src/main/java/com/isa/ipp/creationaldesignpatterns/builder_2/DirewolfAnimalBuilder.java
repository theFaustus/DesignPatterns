/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.builder_2;

/**
 *
 * @author ipascari
 */
public class DirewolfAnimalBuilder extends AnimalBuilder{

    @Override
    public void setName() {
        animal.setName("Ghost"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRace() {
        animal.setRace("Direwolf"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAge() {
         animal.setAge(3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColor() {
        animal.setColor("White"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGender() {
        animal.setGender("Male"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
