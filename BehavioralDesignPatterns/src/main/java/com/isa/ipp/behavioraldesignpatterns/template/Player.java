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
public class Player {

    private AudioTemplate audioTemplate;

    public void setAudioTemplate(AudioTemplate audioTemplate) {
        this.audioTemplate = audioTemplate;
    }

    public void play() {
        audioTemplate.play();
    }

}
