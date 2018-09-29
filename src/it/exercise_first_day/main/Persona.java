/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise_first_day.main;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Persona {

    private String name;
    private String surname;
    private int age;

    public Persona(String name, String surname, int age) throws Exception {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public final void setAge(int age) throws Exception {
        if(age < 0){
//            System.err.println("ERRORE l'età va messa maggiore di 0");
            throw new Exception("Eta minore di zero!!!");
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }
}
