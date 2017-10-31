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
public class MP3Audio extends AudioTemplate {

    @Override
    protected void parse() {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.template.MP3Audio.parse()");
    }

    @Override
    protected void decode() {
        System.out.println("com.isa.ipp.behavioraldesignpatterns.template.MP3Audio.decode()");
    }

}
