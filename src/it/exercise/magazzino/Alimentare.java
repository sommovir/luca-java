/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.magazzino;

import java.util.Date;

/**
 *
 * @author luca
 */
public class Alimentare extends Merce{
    private Date scadenza;

    public Alimentare(Date scadenza, String name, int id, float price) {
        super(name, id, price);
        this.scadenza = scadenza;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }
    
    
}
