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
public class Cane extends AnimaleDomestico{

    public Cane(String nome){
        super(nome);
    }
    
    

    @Override
    public String verso() {
        return "bau bau";
    }

    @Override
    public String getPadrone() {
        return "uomo";
    }
    
}
