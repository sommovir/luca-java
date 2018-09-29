/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.bancomat;

import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public abstract class Account {
    
    private int idCarta;
    private int pin;
    private int saldo;

    public Account() {
    }

    public Account(int idCarta, int pin, int saldo) {
        this.idCarta = idCarta;
        this.pin = pin;
        this.saldo = saldo;
    }

    public int getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(int idCarta) {
        this.idCarta = idCarta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    public abstract List<AbstractBankOperation> getBankOperations();
    
    
    
}
