/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.creationaldesignpatterns.factory_method_1;

/**
 *
 * @author ipascari
 */
public class Forge {
    public static Blacksmith createBlacksmith(BlacksmithRace r){
        switch(r){
            case VALERYAN:
                return new ValeryianBlacksmith();
            case ELF:
                return new ElfBlacksmith();            
        }
        return null;
    }    
}
