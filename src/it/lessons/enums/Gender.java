/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.enums;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public enum Gender {
    
    MALE(123),FEMALE(239);
    
    private int code;

    private Gender(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    
    
    
    
    
}
