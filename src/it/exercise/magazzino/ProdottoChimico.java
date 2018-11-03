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
public class ProdottoChimico extends Merce{
    private String controindicazioni;

    public ProdottoChimico(String controindicazioni, String name, int id, float price) {
        super(name, id, price);
        this.controindicazioni = controindicazioni;
    }

    public String getControindicazioni() {
        return controindicazioni;
    }

    public void setControindicazioni(String controindicazioni) {
        this.controindicazioni = controindicazioni;
    }
    
    
}
