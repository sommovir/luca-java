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
public abstract class BancomatManager {
    
    public abstract void addAccount(Account account);
    
    public abstract void init(Account test1, Account test2, Account test3);
    /**
     * Restituisce l'account con le credenziali passate in argomento. Se le credenziali non vengono trovate, restituisce null. 
     * @param cardID
     * @param pin
     * @return 
     */
    public abstract Account login(int cardID, int pin) throws Exception;
    
    public abstract int getSaldo(Account account);
    
    public abstract void takeMoney(Account account, int money) throws Exception;
    
    public abstract void pushMoney(Account account, int money) throws Exception;
    
    public abstract void exit(Account account);
    
}
