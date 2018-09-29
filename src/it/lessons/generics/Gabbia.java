/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.generics;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Gabbia<T> {
    
    private T animale1;
    private T animale2;
    private T animale3;
    

    public Gabbia() {
    }

    public Gabbia(T animale1, T animale2, T animale3) {
        this.animale1 = animale1;
        this.animale2 = animale2;
        this.animale3 = animale3;
    }

    public T getAnimale1() {
        return animale1;
    }

    public void setAnimale1(T animale1) {
        this.animale1 = animale1;
    }

    public T getAnimale2() {
        return animale2;
    }

    public void setAnimale2(T animale2) {
        this.animale2 = animale2;
    }

    public T getAnimale3() {
        return animale3;
    }

    public void setAnimale3(T animale3) {
        this.animale3 = animale3;
    }
    
    
    
    
    
}
