/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.pool;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Faust
 */
public class Demo {
    public static void main(String[] args) {
        GenericPool<String> pool = new GenericPool<>(() -> UUID.randomUUID().toString());
        for (int i = 0; i < 10; ++i) {
            new Thread(() -> {
            
                try {
                    String value = pool.get();
                    System.out.println(value);
                    TimeUnit.MILLISECONDS.sleep(400);
                    pool.putBack(value);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }).start();
        }
    }
}
