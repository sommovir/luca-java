/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.inheritance.exercise1.ovverride;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class E4 extends E3{

    public E4() {
        super();
        System.out.println("sto costruendo E4");
    }

    @Override
    public String toString() {
        return "CIAO A TUTTI";
    }
    
    
    
    
    
}
