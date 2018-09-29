/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.enums;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {
    public static void main(String[] args) {
        
        Person alfonzo = new Person("Alfonso","Sigmundo" ,2, Gender.MALE,Character.CRAZY);
        
        System.out.println("Codice gender: "+alfonzo.getGender().getCode());
        
    }
}
