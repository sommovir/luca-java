/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.inheritance.lesson1;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Student extends Person{
    
    private University university;

    public Student() {
        super();
    }
    
   
    public Student(String name, String surname, int age){
        
        super(name, surname, age);
        
    }
    
    public Student(String name, String surname, int age, University university){        
        super(name, surname, age);
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + " e studia alla "+this.university.getName(); 
    }

    @Override
    public String getCode() {
        return "01";
    }
    
    
    
    
}
