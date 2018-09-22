/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.inheritance.lesson1;

import it.lessons.inheritance.exercise1.biblioteca.Author;
import it.lessons.inheritance.exercise1.biblioteca.Book;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class DB {

    public static void saveOnDB(Person person) {

        String name = person.getName();
        String surname = person.getSurname();
        String code = person.getCode();

        
        
        System.out.println("OK PERSONA SALVATA CORRETTAMENTE: ");
        System.out.println("\t" + name);
        System.out.println("\t" + surname);
        System.out.println("\t" + code);
        if(person instanceof Worker){
            System.out.println("---> SALARY: "+((Worker)person).getJob().getRAL());
        }
        System.out.println("==================================");
    }

    public static void saveOnDB(Book book) {
        String title = book.getTitle();
        Author author = book.getAuthor();
        int pages = book.getPages();
        String location = book.getLocation();

        System.out.println("OK PERSONA SALVATA CORRETTAMENTE: ");
        System.out.println("\t" + title);
        System.out.println("\t" + author);
        System.out.println("\t" + pages);
        System.out.println("\t" + location);
        System.out.println("==================================");
    }
}
