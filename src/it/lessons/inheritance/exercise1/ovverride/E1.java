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
public class E1 extends ClasseBase{

    public E1() {
        super();
        System.out.println("sto costruendo E1");
    }

    @Override
    public String toString() {
        return "E1: "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
