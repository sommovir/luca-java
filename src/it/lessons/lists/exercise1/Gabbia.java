/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.lists.exercise1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Gabbia<T, E> {

    private E guardiano;

    private List<T> lista_animali = new LinkedList<T>();

    public Gabbia() {

    }

    public void addAnimale(T animale) {
        this.lista_animali.add(animale);
    }

    public void setGuardian(E guardiano) {
        this.guardiano = guardiano;
    }

    public void print() {
        for (T animal : lista_animali) {
            System.out.println(animal);
        }
    }

    public int sizeOfCage() {
        return this.lista_animali.size();
    }

    public boolean removeByName(String name) {

        for (T animal : lista_animali) {
            if (animal instanceof Animale) {
                if (((Animale) animal).getName().equals(name)) {

                    return true;
                }
            }   
        }
        return false;
    
    }
    
}
