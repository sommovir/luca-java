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
public class BankAccount extends Account {

    private List<AbstractBankOperation> bank_operations = new LinkedList<>();
    
    public BankAccount(int idCarta, int pin, int saldo) {
        super(idCarta, pin, saldo);
        
    }
    

    public void addSaldo(int money) {
        this.setSaldo(this.getSaldo() + money);
        BankOperation operation = new BankOperation();
        operation.setAmount(money);
        operation.setPrelievo(false);
        this.bank_operations.add(operation);
    }

    public void takeSaldo(int money) throws Exception {
        if ((this.getSaldo() - money) < 0) {
            throw new Exception("Non c'hai sordi!");
        } else {
            this.setSaldo(this.getSaldo() - money);
            BankOperation operation = new BankOperation();
            operation.setAmount(money);
            operation.setPrelievo(true);
            this.bank_operations.add(operation);
        }

    }



@Override
    public List<AbstractBankOperation> getBankOperations() {
       return this.bank_operations;
        
    }
    
}
