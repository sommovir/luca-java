/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.inheritance.exercise1.biblioteca;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Volume extends Book {

    private Enciclopedy enciclopedy;

    public Volume(String title, Author author, int pages, Enciclopedy enciclopedy) {
        super(title, author, pages);
        this.enciclopedy = enciclopedy;
    }

    public Enciclopedy getEnciclopedy() {
        return this.enciclopedy;
    }

    public void setEnciclopedy(Enciclopedy enciclopedy) {
        this.enciclopedy = enciclopedy;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public String getLocation() {
        return "Settore 05";
    }

}
