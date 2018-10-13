/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.patterns;

import it.lessons.patterns.singletone.DBManager;
import it.lessons.patterns.singletone.SettingsManager;
import it.lessons.patterns.staticClass.Utility;
import javax.swing.JOptionPane;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {
    
    public static void main(String[] args) {
        Utility.openFile("fff.txt");
        
        
        String porta = JOptionPane.showInputDialog(null, "Inserire la porta:");
        SettingsManager.getInstance().setPort(porta);
        
        DBManager.getInstance().connect();
       
        
        
        System.out.println("-------------------------------");
        
        DBManager.getInstance().disconnect();
        
        
    }
    
}
