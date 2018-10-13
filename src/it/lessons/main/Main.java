/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.main;

import it.lessons.inheritance.exercise1.biblioteca.Author;
import it.lessons.inheritance.exercise1.biblioteca.Book;
import it.lessons.inheritance.exercise1.biblioteca.Narrative;
import it.lessons.inheritance.lesson1.DB;
import it.lessons.inheritance.lesson1.Job;
import it.lessons.inheritance.lesson1.Person;
import it.lessons.inheritance.lesson1.Student;
import it.lessons.inheritance.lesson1.University;
import it.lessons.inheritance.lesson1.Worker;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
        }
        if (args.length > 0) {
            if (args[0].equals("-i")) {
                System.out.println("Info");
            } else {
                System.out.println("else");
            }
        }

//        System.out.println("Main!");
////        Person gino = new Person("Gino", "Coraci", 22);
//        Student mario = new Student("Mario", "Rossi", 33, new University("Sapienza"));
//        
//        System.out.println("Mario che ha "+  mario.getAge() +" anni, frequenta: "+mario.getUniversity().getName());
//        
//        Worker paolo = new Worker("Paolo","Tarso",31,new Job("legionario",18000));
//        
//        System.out.println(paolo.getName() + " " + paolo.getSurname() + " guadagna " + paolo.getJob().getRAL());
//        
//        System.out.println("TO STRING DI MARIO = "+mario.toString());
//        System.out.println("TO STRING DI PAOLO = "+paolo.toString());
//        
//        Person [] amici = new Person[3];
//        
//        Person filippo = new Student("Filippo", "Giannini", 32, new University("Roma 3"));
//        
//        Person sara = new Student("Sara", "Pallosini", 3, new University("Tor Vergata"));
//        
//        Person achille = new Worker("Achille", "Ochetto", 34, new Job("Politico", 19999999));
//        
//        amici[0] = filippo;
//        amici[1] = sara;
//        amici[2] = achille;
//        System.out.println("========================");
//        for (int i = 0; i < 3; i++) {
//            //System.out.println(amici[i].toString() + " e il codice è : "+amici[i].getCode());
//            DB.saveOnDB(amici[i]);
//        }
//        
//        Author tolkien = new Author( "Mario", "Tolkien", 45 );
//        Book lotr = new Narrative("Lord of the rings",tolkien,1200,"Fantasy");
//        System.out.println(lotr.toString());
//        
//        DB.saveOnDB(lotr);
    }

}
