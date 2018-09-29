/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.generics;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Lontra extends Animale{

    public Lontra() {
        super();
    }
    
    public Lontra(String nome) {
        super(nome);
    }
    

    @Override
    public String speak() {
        return "lont lont";
    }
    
}
