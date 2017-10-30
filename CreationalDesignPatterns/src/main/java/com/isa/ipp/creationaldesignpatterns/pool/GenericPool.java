/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Faust
 */
public class GenericPool<T> {
    private static final int MIN_SIZE = 5;
    private final BlockingQueue<T> pool = new ArrayBlockingQueue<>(MIN_SIZE);
    private final Supplier<T> producer;
    
    public GenericPool(Supplier<T> producer) {
        this.producer = producer;
        for (int i = 0; i < MIN_SIZE; ++i) {
            pool.add(producer.get());
        }
    }
    
    public T get() {
        try {
            return pool.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void putBack(T obj) {
        try {
            pool.put(obj);
        } catch (InterruptedException ex) {
            Logger.getLogger(GenericPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
