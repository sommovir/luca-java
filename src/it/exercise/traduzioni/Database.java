/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.traduzioni;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Database {
    
    public static List<Articolo> getArticoli(){
        
        List<Articolo> articoli = new LinkedList<>();
        
        Articolo a1 = new Articolo(Linguaggio.IT, "Articolo 1", 1); //x
        Articolo a2 = new Articolo(Linguaggio.EN, "EN news 2", 2); //x
        Articolo a3 = new Articolo(Linguaggio.IT, "Articolo 2", 2); //x
        Articolo a4 = new Articolo(Linguaggio.EN, "EN news 1", 1); //x
        Articolo a5 = new Articolo(Linguaggio.EN, "EN news 3", 3);//x
        Articolo a6 = new Articolo(Linguaggio.IT, "Articolo 4", 4); //x
        Articolo a7 = new Articolo(Linguaggio.IT, "Articolo 5", 5); //x
        Articolo a8 = new Articolo(Linguaggio.IT, "Articolo 3", 3); //x
        Articolo a9 = new Articolo(Linguaggio.IT, "Articolo 1", 6);//x
        Articolo a10 = new Articolo(Linguaggio.EN, "EN news 6", 6);//x
        
        articoli.add(a1);
        articoli.add(a2);
        articoli.add(a3);
        articoli.add(a4);
        articoli.add(a5);
        articoli.add(a6);
        articoli.add(a7);
        articoli.add(a8);
        articoli.add(a9);
        articoli.add(a10);
        
        /*
        EN news 1
        EN news 2
        EN news 3
        Articolo 4
        Articolo 5
        EN news 6
        */
        return articoli;
        
    }
    
}
