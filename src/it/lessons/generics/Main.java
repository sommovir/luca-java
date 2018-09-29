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
public class Main {
    
    
    public static void main(String[] args) {
        Cane cane = new Cane("Fido");
        Cane cane2 = new Cane("Emilio");
        Cane cane3 = new Cane("Giulio");
        
        Lontra lon1 = new Lontra("Lontra 1");
        Lontra lon2 = new Lontra("Lontra 2");
        Lontra lon3 = new Lontra("Lontra 3");
        
        Pinguino pingu1 = new Pinguino("P1");
        Pinguino pingu2 = new Pinguino("P2");
        Pinguino pingu3 = new Pinguino("P3");
        
        Gabbia<Cane> gabbia = new Gabbia<>();
        
        gabbia.setAnimale1(cane);
        gabbia.setAnimale2(cane2);
        gabbia.setAnimale3(cane3);
        
        Gabbia<Pinguino> gabbia2 = new Gabbia<>();
        gabbia2.setAnimale1(pingu1);
       
    }
}
