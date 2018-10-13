/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.interfaces;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("MAIN -  INTERFACES");

        Cane cane1 = new Cane("fido");
        Cane cane2 = new Cane("umberto");
        Gatto gatto = new Gatto("micio");
        Stambecco s = new Stambecco("gennaro");
        Pinguino pingu = new Pinguino("gino");
        Stambecco s2 = new Stambecco("becco");

        Gabbia<AnimaleDomestico> gabbia = new Gabbia<>();

        gabbia.addDaIngabbiare(cane1);
        gabbia.addDaIngabbiare(cane2);
        gabbia.addDaIngabbiare(gatto);
//        gabbia.addDaIngabbiare(s);
//        gabbia.addDaIngabbiare(pingu);
//        gabbia.addDaIngabbiare(s2);

        for (AnimaleDomestico animale : gabbia.getIngabbiati()) {
            System.out.println("VERSO: " + animale.verso());
        }

        GabbiaSpeciale<AnimaleDomestico> gabbiaSpeciale = new GabbiaSpeciale<>();

        gabbiaSpeciale.addDaIngabbiare(cane1);
        gabbiaSpeciale.addDaIngabbiare(cane2);
        gabbiaSpeciale.addDaIngabbiare(gatto);
//        gabbia.addDaIngabbiare(s);
//        gabbia.addDaIngabbiare(pingu);
//        gabbia.addDaIngabbiare(s2);

        for (AnimaleDomestico animale : gabbiaSpeciale.getIngabbiati()) {
            System.out.println("VERSO: " + animale.verso());
        }

    }

}
