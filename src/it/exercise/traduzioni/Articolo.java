/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.traduzioni;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Articolo implements Comparable<Articolo>{

    private Linguaggio linguaggio;
    private String testo;
    private int id;

    public Articolo() {
    }

    public Articolo(Linguaggio linguaggio, String testo, int id) {
        this.linguaggio = linguaggio;
        this.testo = testo;
        this.id = id;
    }

    public Linguaggio getLinguaggio() {
        return linguaggio;
    }

    public void setLinguaggio(Linguaggio linguaggio) {
        this.linguaggio = linguaggio;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Articolo o) {
        return Integer.compare(id, o.getId());
    }

}
