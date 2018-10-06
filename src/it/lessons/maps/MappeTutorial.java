/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.maps;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class MappeTutorial {
    
    public static void main(String[] args) {
        
        Map<String,Integer> map = new HashMap<>();
        map.put("lunedì", 1);
        map.put("martedì", 2);
        map.put("mercoledì", 3);
        map.put("giovedì", 4);
        map.put("venerdì", 5);
        map.put("sabato", 6);
        map.put("domenica", 7);
        
        String giorno = JOptionPane.showInputDialog(null, "Inserisci il giorno");
        
        Integer value = map.get(giorno.toLowerCase());
        
        System.out.println(value);
    }
    
}
