/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise_first_day.main;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Cane {
    
    private String nome;
    private String razza;
    
    public void baubau(){
        System.out.println("Bau Bau");
    }

    
    public Cane(String nome) throws Exception{
        setNome(nome);
        System.out.println("qualcuno ha costruito un cane");
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public final void setNome(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Hai dimenticato di inserire il nome!");
        }
        this.nome = nome;
    }
    
    public String getRazza(){
        return this.razza;
    }
    
    public void setRazza(String razza){
        this.razza = razza; 
    }
}
        
    

