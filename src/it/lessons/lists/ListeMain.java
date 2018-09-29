/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.lists;

import it.lessons.lists.exercise1.Gabbia;
import it.lessons.lists.exercise1.Giraffa;
import it.lessons.lists.exercise1.Lavoratore;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class ListeMain {

    public static void main(String[] args) {

//        List<Integer> lista = new LinkedList<>();
//        
//        lista.add(3);
//        lista.add(4);
//        lista.add(6);
//        lista.add(8);
//        
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println("ELEMENT = "+lista.get(i));
//        }
//        System.out.println("==========================");
//        
//        for(Integer elem : lista){
//            System.out.println("foreach: "+elem);
//        }
//        
//        System.out.println("------------");
//        
//        //lista.clear(); // cancella tutto il contenuto della lista
//        
//        boolean contenuto = lista.contains(6);
//        
//        System.out.println("la lista contiene il 6 ? "+contenuto);
//        
//        System.out.println("la lista contiene "+lista.size()+" elementi");
//        
//        int indexOf = lista.indexOf(6); //ritorna l'indice di dove si trova l'elemento passato in argomento, -1 se non viene trovato
//        
//        System.out.println("l'indice di 6: "+indexOf);
//        
//        boolean empty = lista.isEmpty();
//        
//        System.out.println("la lista è vuota ? "+empty);
//        
//        lista.remove((Integer)3);
//        
//        System.out.println("SIZE OF LIST = "+lista.size());
//        
//        indexOf = lista.indexOf(6); //ritorna l'indice di dove si trova l'elemento passato in argomento, -1 se non viene trovato
//        
//        System.out.println("l'indice di 6 dopo aver rimosso il 3 è : "+indexOf);
        Gabbia<Giraffa, Lavoratore> cage = new Gabbia<>();
        
        cage.addAnimale(new Giraffa("Giggy"));
        cage.addAnimale(new Giraffa("Bessy"));
        cage.addAnimale(new Giraffa("Molly"));
        
        cage.setGuardian(new Lavoratore ("Anacleto"));
        
       cage.print();
        System.out.println("Nella gabbia ci sono "+ cage.sizeOfCage() + " animali.");
        
        System.out.println(cage.removeByName("Molly"));
        
    }

}
