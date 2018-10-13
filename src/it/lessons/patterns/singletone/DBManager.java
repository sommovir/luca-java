/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.patterns.singletone;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class DBManager {
    
    private boolean connesso = false;
    
    private static DBManager _instance = null;
    
    private DBManager(){
        
    }
    
    public static DBManager getInstance(){
        if(_instance == null){
            _instance = new DBManager();
        }
        return _instance;
    }
    
    
    
    
    public void connect(){
        
        System.out.println("Mi sto connettendo a IP: "+SettingsManager.getInstance().getIp());
        System.out.println("e PORT: "+SettingsManager.getInstance().getPort());
        if(!this.connesso){
            this.connesso = true;
            System.out.println("connessione riuscita");
        }else{
            System.err.println("ERRORE sono già connesso");
        }
    }
    
    public void disconnect(){
        if(this.connesso){
            this.connesso = false;
            System.out.println("DISCONNESSo");
        }else{
            System.err.println("ERRORE non sono connesso");
        }
    }
    
}
