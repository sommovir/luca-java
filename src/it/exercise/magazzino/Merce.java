/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.exercise.magazzino;

/**
 *
 * @author luca
 */
public abstract class Merce {
    private String name;
    private float price;
    private int id;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Merce() {
    }

    public Merce(String name, int id, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    
    
}
