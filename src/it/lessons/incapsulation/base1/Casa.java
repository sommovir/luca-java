/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.incapsulation.base1;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Casa {

    private int n_of_windows;
    private boolean open;
    private String address;

    public Casa() {

    }

    public Casa(int n_of_windows, boolean open, String address) {

        this.n_of_windows = n_of_windows;
        this.open = open;
        this.address = address;

    }

    public int getWindows() {
        return this.n_of_windows;
    }

    public boolean isOpen() {
        return this.open;
    }

    public String getAddress() {
        return this.address;
    }

    public void setWindows(int n_of_windows) {
        this.n_of_windows = n_of_windows;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
