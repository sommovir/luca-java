/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise_first_day.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ciao a tutti");

        int x = 2;

       // Cane cane = new Cane("Gino");
//        cane.nome = "Gigi";
       // cane.baubau();

        //String nomedelcane = cane.getNome();
        //cane.setNome("Mario");
        //System.out.println(nomedelcane);

        //System.out.println("Il cane si chiama " + nomedelcane);

        while (true) {
            int age = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'età"));

            Persona claudio;
            try {
                claudio = new Persona("Claudio", "Castellani", age);
                System.out.println("Il nome della persona è " + claudio.getName());
                System.out.println("l'età di " + claudio.getName() + " è " + claudio.getAge());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "L'età non può essere minore di zero");
                continue;
            }
            break;
        }
        
        Cane lessie;

        while (true) {
            
            String nome = JOptionPane.showInputDialog("Inserisci il tuo nome:");

            

            try {
                lessie = new Cane(nome);
                
            } catch (Exception babba) {
                JOptionPane.showMessageDialog(null, babba.getMessage());
                continue;
            }
           
            break;
            
        }

        System.out.println("Il tuo nome è: " + lessie.getNome());
    }

}


