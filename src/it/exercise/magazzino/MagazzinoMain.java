/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.magazzino;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luca
 */
public class MagazzinoMain {

    public static void main(String[] args) {
        try {
            //System.out.println("check");
            // System.out.println("max float=" +Double.MAX_VALUE);

            Merce castle = new Giocattolo("Lego Castle", 1, 29.99f, 7);
            Merce rigatoniVoiello = new Alimentare(new Date(), "Rigatoni Voiello", 2, 2.99f);
            Merce napalm = new ProdottoChimico("Scottatura,Ustioni di primo grado, Morte", "Napalm", 3, 89.99f);
            Merce sapientino = new Giocattolo("Sapientino Animali della fattoria", 4, 19.99f, 4);
            Merce noodles = new Alimentare(new Date(), "Noodles per Ramen ", 5, 6.99f);
            Merce stricnica = new ProdottoChimico("Morte", "Veleno per topi", 6, 24.99f);
            Merce dietilammide = new ProdottoChimico("Schizofrenia, attacchi di panico", "Dietilammide dell'Acido Lisergico (LSD)", 7, 9.99f);
            Merce chianina = new Alimentare(new Date(), "Bistecca di carne Chianina", 8, 12.99f);

            Magazzino.getInstance().addScaffale(new Scaffale<Giocattolo>(100));
            Magazzino.getInstance().addScaffale(new Scaffale<Alimentare>(100));
            Magazzino.getInstance().addScaffale(new Scaffale<ProdottoChimico>(100));

            Magazzino.getInstance().addMerce(castle, 0);
            Magazzino.getInstance().addMerce(rigatoniVoiello, 1);
            Magazzino.getInstance().addMerce(napalm, 2);
            Magazzino.getInstance().addMerce(sapientino, 0);
            Magazzino.getInstance().addMerce(noodles, 1);
            Magazzino.getInstance().addMerce(stricnica, 2);
            Magazzino.getInstance().addMerce(dietilammide, 2);
            Magazzino.getInstance().addMerce(chianina, 1);

            Scaffale scaffaleById = Magazzino.getInstance().getScaffaleById(2);
            List<Merce> prodotti = scaffaleById.getProdotti();

            for (Merce m : prodotti) {
                System.out.println("MERCE: " + m.getName() + ", ID: " + m.getId());
            }

            System.out.println("Posti rimanenti in magazzino: " + Magazzino.getInstance().postiMancanti());
            System.out.println("Valore totale dei prodotti in magazzino : " + Magazzino.getInstance().getTotalPrice());
            System.out.println("Numero dei prodotti in magazzino : " + Magazzino.getInstance().getNumberOfItems());

        } catch (Exception ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
}
