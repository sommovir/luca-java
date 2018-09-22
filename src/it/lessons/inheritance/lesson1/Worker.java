/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.inheritance.lesson1;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Worker extends Person {

    private Job job;

    public Worker() {
        super();
    }

    public Worker(String name, String surname, int age) {

        super(name, surname, age);
    }

    public Worker(String name, String surname, int age, Job job) {
        super(name, surname, age);
        this.job = job;

    }

    public Job getJob() {
        return this.job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + " e guadagna: "+this.getJob().getRAL();
    }

    @Override
    public String getCode() {
        return "02";
    }

}
