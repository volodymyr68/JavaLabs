package com.company.lab1;

public class Hour {
    public int numofbuyers;
    public int counter;
    public String comment;

    public Hour(int numofbuyers, int counter, String comment) {
        super();
        this.numofbuyers = numofbuyers;
        this.comment = comment;
        this.counter = counter;
    }

    public Hour() {
    }
    // hour arr[]= new hour[5];


    public int getNumofbuyers() {
        return numofbuyers;
    }

    public void setNumofbuyers(int numofbuyers) {
        this.numofbuyers = numofbuyers;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "";
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}