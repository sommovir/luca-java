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
    
    public abstract Account login(int cardID, int pin);
    
    public abstract int getSaldo(Account account);
    
    public abstract void takeMoney(Account account, int money) throws Exception;
    
    public abstract void pushMoney(Account account, int money);
    
    public abstract void exit(Account account);
    
}
