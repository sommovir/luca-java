/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.bancomat;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author luca
 */
public class BancomatManager_imp extends BancomatManager {
    
    private List<Account> list_accounts = new LinkedList<>();
    
    @Override
    public void addAccount(Account account) {
        this.list_accounts.add(account);
    }
    
    @Override
    public void init(Account test1, Account test2, Account test3) {
        this.list_accounts.add(test1);
        this.list_accounts.add(test2);
        this.list_accounts.add(test3);
    }
    
    @Override
    public Account login(int cardID, int pin) throws Exception {
        for (Account acc : list_accounts) {
            if (acc.getIdCarta() == cardID) {
                if (acc.getPin() == pin) {
                    return acc;
                } else {
                    throw new Exception("pin errato");
                    
                }
            }
        }
        throw new Exception("Carta non trovata");
        
    }
    
    @Override
    public int getSaldo(Account account) {
        return account.getSaldo();
    }
    
    @Override
    public void takeMoney(Account account, int money) throws Exception {
        if (account instanceof BankAccount) {
            ((BankAccount) account).takeSaldo(money);
            
        };
    }
    
    @Override
    public void pushMoney(Account account, int money) {
        if (account instanceof BankAccount) {
            ((BankAccount) account).addSaldo(money);
            
        };
    }
    
    @Override
    public void exit(Account account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
