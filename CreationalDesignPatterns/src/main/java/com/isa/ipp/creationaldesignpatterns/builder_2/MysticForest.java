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
public class MysticForest {
    private AnimalBuilder animalBuilder;

    public AnimalBuilder getAnimalBuilder() {
        return animalBuilder;
    }

    public void setAnimalBuilder(AnimalBuilder animalBuilder) {
        this.animalBuilder = animalBuilder;
    }
    
    public void createMysticAnimal(){
        animalBuilder.createAnimal();
        animalBuilder.setName();
        animalBuilder.setColor();
        animalBuilder.setGender();
        animalBuilder.setRace();
        animalBuilder.setAge();
        
        System.out.println(animalBuilder.getAnimal().getRace() + " " + animalBuilder.getAnimal().getName() + " on the ground. (Builder)");
    }
}
