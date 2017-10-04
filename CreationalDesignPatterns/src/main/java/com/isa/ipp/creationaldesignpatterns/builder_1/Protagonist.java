/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.builder_1;

/**
 *
 * @author ipascari
 */
public class Protagonist {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    private Protagonist(ProtagonistBuilder b) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class ProtagonistBuilder {

        private String firstName;
        private String lastName;
        private String gender;
        private int age;

        public ProtagonistBuilder() {
        }

        public ProtagonistBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProtagonistBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProtagonistBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public ProtagonistBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public Protagonist build(){
            System.out.println(this.firstName + " " + this.lastName + " on the ground (Builder).");
            return new Protagonist(this);
        }
    }

}
