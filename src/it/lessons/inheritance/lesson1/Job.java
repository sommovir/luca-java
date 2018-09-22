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
public class Job {
    
    private String name;
    private int RAL;

    public Job() {
    }

    public Job(String name, int RAL) {
        this.name = name;
        this.RAL = RAL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRAL() {
        return RAL;
    }

    public void setRAL(int RAL) {
        this.RAL = RAL;
    }

    
}
