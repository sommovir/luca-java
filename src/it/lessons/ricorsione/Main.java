/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.ricorsione;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {
    
    public static void printTree(Node nodo){
        
        
        if(nodo.getLeft()!=null){
            printTree(nodo.getLeft());
        }
        System.out.println("E: "+nodo.getElement());
        if(nodo.getRight()!=null){
            printTree(nodo.getRight());
        }
       
        
    }
    
    public static void main(String[] args) {
        
        Node n7 = new Node(14,null,null);
        Node n6 = new Node(20,n7,null);
        Node n5 = new Node(13,null,n6);
        Node n3 = new Node(3,null,null);
        Node n4 = new Node(8,null,null);
        Node n2 = new Node(7,n3,n4);
        Node n1 = new Node(10,n2,n5);
        
        Tree tree = new Tree(n1);
        printTree(tree.getRoot());
        
        
        
        
        
        
       
        
        
        
        
        
    }
    
}
