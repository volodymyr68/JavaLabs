package com.company.lab1;

public class hour {
    private int numOfBuyers;
    private int counter;
    private String comment;

    public hour(int numOfBuyers, int counter, String comment) {
        this.numOfBuyers = numOfBuyers;
        this.comment = comment;
        this.counter = counter;
    }

    public hour() {
    }


    public int getNumOfBuyers() {
        return numOfBuyers;
    }

    public void setNumOfBuyers(int numOfBuyers) {
        this.numOfBuyers = numOfBuyers;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Num of buyers : " + numOfBuyers + " ,Hour : " + counter +":00 " +" , Comment : " + comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
