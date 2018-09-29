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
public class Person {
    
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private Character character;

    public Person() {
    }

    public Person(String name, String surname, int age, Gender gender, Character character) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    
    
    
}
