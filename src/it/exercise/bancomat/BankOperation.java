/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.bancomat;

/**
 *
 * @author luca
 */
public class BankOperation extends AbstractBankOperation {

    private int amount;
    private boolean prelievo;

    public BankOperation() {
    }

    public BankOperation(int amount, boolean prelievo) {
        this.amount = amount;
        this.prelievo = prelievo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isPrelievo() {
        return prelievo;
    }

    public void setPrelievo(boolean prelievo) {
        this.prelievo = prelievo;
    }
    
    
    
    @Override
    public String description() {
      String result = this.prelievo ? "-" : "+";
      result+=amount;
      return result;
      
    }
    
}
