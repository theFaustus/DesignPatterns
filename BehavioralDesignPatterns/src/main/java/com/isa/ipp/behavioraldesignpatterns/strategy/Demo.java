/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.behavioraldesignpatterns.strategy;

/**
 *
 * @author Faust
 */
public class Demo {
    public static void main(String[] args) {
        DataTransfer dt = new DataTransfer();
        dt.setP(new UDP());
        dt.sendStream();
        dt.setP(new TCP());
        dt.sendStream();
    }
}
