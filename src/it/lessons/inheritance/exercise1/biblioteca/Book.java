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
public abstract class Book {

    private String title;
    private Author author;
    private int pages;

    public Book(String title, Author author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;

    }
    
    public String getTitle(){
    return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public abstract String getLocation();

    @Override
    public String toString() {
        return "Titolo: " + this.title + "; Autore: " + this.author ;
    }
    
    

}
