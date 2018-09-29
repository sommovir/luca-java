/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.inheritance.exercise1.overload;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Person {

    private String name;
    
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void speak(){
        System.out.println("Hello!");
    }
    
    public void speak(String word){
        System.out.println("Hello "+word);
    }
    
    public void speak(String word1, String word2){
        System.out.println("Hello "+word1 + ", "+word2);
    }
    
    public void speak(int x){
        System.out.println("Non so che dire ma dico: "+x);
    }
    

    
}
