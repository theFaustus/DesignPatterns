package com.isa.ipp.behavioraldesignpatterns.template;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faust
 */
public abstract class AudioTemplate {

    protected abstract void parse();

    protected abstract void decode();

    public void play() {
        parse();
        decode();
    }

}
