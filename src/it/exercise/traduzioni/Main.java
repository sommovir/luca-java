/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.traduzioni;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    public static Articolo find_eng(List<Articolo> lista, int id) {
        for (Articolo art : lista) {
            if (art.getId() == id) {
                return art;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        List<Articolo> articoli = Database.getArticoli();
        List<Articolo> articoli_ita = new LinkedList<>();
        List<Articolo> articoli_eng = new LinkedList<>();
        List<Articolo> mixed_lang = new LinkedList<>();

        for (Articolo art : articoli) {
            if (art.getLinguaggio() == Linguaggio.IT) {
                articoli_ita.add(art);
            } else {
                articoli_eng.add(art);
            }
        }

        Collections.sort(articoli_ita);
        Collections.sort(articoli_eng);

        for (Articolo art_ita : articoli_ita) {
            Articolo art_eng = find_eng(articoli_eng, art_ita.getId());
            if (art_eng == null) {
                mixed_lang.add(art_ita);
            } else {
                mixed_lang.add(art_eng);
            }
        }

        for (Articolo mix : mixed_lang) {
            System.out.println(mix.getTesto());
        }

        System.out.println("MAIN TRADUZIONI");
        System.out.println("_____________________________________________________________________");

        Map<Integer, String> map = new HashMap<>();

        for (Articolo art : articoli) {
            if (art.getLinguaggio() == Linguaggio.IT) {
                map.put(art.getId(), art.getTesto());
            }
        }

        for (Articolo art : articoli) {
            if (art.getLinguaggio() == Linguaggio.EN) {
                map.put(art.getId(), art.getTesto());
            }
        }

        Set<Integer> keySet = map.keySet();

        for (Integer key : keySet) {
            String value = map.get(key);
            System.out.println(value);
        }

    }

}
