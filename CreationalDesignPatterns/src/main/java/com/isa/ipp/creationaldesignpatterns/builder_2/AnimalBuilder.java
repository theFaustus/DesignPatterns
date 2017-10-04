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
public abstract class  AnimalBuilder {
    protected Animal animal;

    public Animal getAnimal() {
        return animal;
    }
    
    public void createAnimal() {
        animal = new Animal();
    }
            
    public abstract void setName();
    public abstract void setRace();
    public abstract void setAge();
    public abstract void setColor();
    public abstract void setGender();
}
