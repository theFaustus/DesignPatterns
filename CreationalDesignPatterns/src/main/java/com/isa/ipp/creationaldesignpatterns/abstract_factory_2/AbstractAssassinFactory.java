/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.abstract_factory_2;

import java.util.List;

/**
 *
 * @author Faust
 */
public class AbstractAssassinFactory {
    public Assassin prototype;
    
    public Assassin createAssassin(){
        return prototype.clone();
    }
            
}
