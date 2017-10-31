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
public class Demo {

    public static void main(String[] args) {
        Player p = new Player();
        p.setAudioTemplate(new MP3Audio());
        p.play();
        p.setAudioTemplate(new WAVAudio());
        p.play();
    }
}
