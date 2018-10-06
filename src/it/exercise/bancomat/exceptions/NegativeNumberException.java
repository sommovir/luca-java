/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.bancomat.exceptions;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class NegativeNumberException extends Exception{

    public NegativeNumberException() {
        super("Non puoi usare numeri negativi");
    }
    
    
    
}
