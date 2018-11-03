/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.magazzino;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author luca
 */
public class Magazzino {

    private static Magazzino instance = null;
    private Map<Integer, Integer> mappa = new HashMap<>();
    private final List<Scaffale> scaffali = new LinkedList<>();

    private Magazzino() {

    }

    public static Magazzino getInstance() {
        if (instance == null) {
            instance = new Magazzino();
        }
        return instance;
    }

    public void addScaffale(Scaffale scaffale) {
        this.scaffali.add(scaffale);
    }

    public void addMerce(Merce merce, int scaffale) throws Exception {

        if (scaffale >= scaffali.size() || scaffale < 0) {
            throw new Exception("Lo scaffale non esiste");
        }

        this.scaffali.get(scaffale).addMerce(merce);
        this.mappa.put(merce.getId(), scaffale);
    }

    public Scaffale getScaffaleById(int id) throws Exception {
        Integer numeroScaffale = this.mappa.get(id);
        if (numeroScaffale == null) {
            throw new Exception("merce non trovata in nessuno scaffale");
        } else {
            return this.scaffali.get(numeroScaffale);
        }
    }

    //numero merci
    // totale prezzo
    //totale posti rimanenti
    public int getNumberOfItems() {
        int total = 0;

        for (Scaffale s : scaffali) {
            total += s.getProdotti().size();
        }

        return total;
    }

    public float getTotalPrice() {

        float total = 0;

        for (Scaffale s : scaffali) {
            List<Merce> merci = s.getProdotti();
            for (Merce m : merci) {
                total += m.getPrice();
            }
        }
        return total;
    }

    public int postiMancanti() {
        int total = 0;
        int capienza = 0;
        int rimanenti = 0;

        for (Scaffale s : scaffali) {
            capienza += s.getMax();
            total += s.getProdotti().size();
        }

        rimanenti = capienza - total;
        return rimanenti;

    }

    public boolean findProductByName(String nome) {
        boolean trovato = false;

        for (Scaffale s : scaffali) {
            List<Merce> merci = s.getProdotti();
            for (Merce m : merci) {
                if (nome.equalsIgnoreCase(m.getName())) {
                    trovato = true;
                    return trovato;
                }
            }
        }

        return trovato;

    }

    public Merce findMostExpensive() {

        Merce mostExpensive = null;

        for (Scaffale s : scaffali) {
            List<Merce> merci = s.getProdotti();
            for (Merce m : merci) {
                if (mostExpensive == null) {
                    mostExpensive = m;
                } else if (m.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = m;
                }
            }
        }
        return mostExpensive;

    }
    
//    public void removeProductById(int id) throws Exception{
//    Integer product = this.mappa.get(id);
//        if (product == null) {
//            throw new Exception("merce non trovata in nessuno scaffale");
//        } else {
//             this.scaffali.;
//             this.mappa.remove(id);
//        }
//    }

    // ricerca per nome prodotto
    // trova la merce più costosa nel magazzino
    // toglie merce dal magazzino tramite id
}
