/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.magazzino;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luca
 */
public class Scaffale<T extends Merce> {

    private int max;

    private List<T> prodotti = new ArrayList<>(max);

    public Scaffale(int max) {
        this.max = max;
    }

    public void addMerce(T merce) throws Exception {
        if (this.prodotti.size() == max) {
            throw new Exception("Lo scaffale è pieno");
        }

        this.prodotti.add(merce);
    }

    public List<T> getProdotti() {
        return this.prodotti;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
