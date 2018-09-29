/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.inheritance.exercise1.ovverride;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class ClasseBase {
    
    private int x;

    public ClasseBase() {
        System.out.println("sto costruendo classe base");
    }

    public ClasseBase(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "ClasseBase";
    }
    
    
    
}
