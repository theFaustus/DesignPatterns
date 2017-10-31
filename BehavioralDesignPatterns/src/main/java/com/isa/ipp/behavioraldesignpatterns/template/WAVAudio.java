/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.template;

/**
 *
 * @author Faust
 */
public class WAVAudio extends AudioTemplate {

    @Override
    protected void parse() {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.template.WAVAudio.parse()");
    }

    @Override
    protected void decode() {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.template.WAVAudio.decode()");
    }

}
