/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.interfaces;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public abstract class Animale {
    
    private String name;

    public Animale() {
    }

    public Animale(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract String verso();
    
}
