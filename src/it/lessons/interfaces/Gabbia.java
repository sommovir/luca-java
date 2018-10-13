/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.interfaces;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Gabbia<T> {
    
    private List<T> ingabbiati = new LinkedList<>();

    public Gabbia() {
    }
    
    public void addDaIngabbiare(T t){
        this.ingabbiati.add(t);
    }

    public List<T> getIngabbiati() {
        return ingabbiati;
    }
    
    
    
}
