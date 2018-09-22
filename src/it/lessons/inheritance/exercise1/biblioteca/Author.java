/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.inheritance.exercise1.biblioteca;

import it.lessons.inheritance.lesson1.Person;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Author extends Person{
    
        public Author(String name, String surname, int age) {
        super(name,surname,age);
    }

    @Override
    public String getCode() {
        return "36";
    }
    
}
