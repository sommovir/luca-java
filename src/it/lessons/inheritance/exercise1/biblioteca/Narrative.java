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
public class Narrative extends Book {

    private String type;

    public Narrative(String title, Author author, int pages, String type) {
        super(title, author, pages);
        this.type = type;

    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getLocation() {
        return "SETTORE 02";
    }

}
