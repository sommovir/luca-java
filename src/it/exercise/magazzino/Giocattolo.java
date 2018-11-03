/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.magazzino;

/**
 *
 * @author luca
 */
public class Giocattolo extends Merce {
    private int etaMinima;

    public Giocattolo(String name, int id, float price, int etaMinima) {
        super(name, id, price);
        this.etaMinima = etaMinima;
    }
    

    public int getEtaMinima() {
        return etaMinima;
    }

    public void setEtaMinima(int etaMinima) {
        this.etaMinima = etaMinima;
    }

    
}
