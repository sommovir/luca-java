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
public class Essay extends Book {

    private String argument;

    public Essay(String title, Author author, int pages, String argument) {
        super(title, author, pages);
        this.argument = argument;
    }

    
    
    public String getArgument() {
        return this.argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    @Override
    public String getLocation() {
        return "SETTORE 01";
    }

    @Override
    public String getTitle() {
        return "ESSAY: "+super.getTitle(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
