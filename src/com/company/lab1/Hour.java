package com.company.lab1;

public class Hour {

    private int numOfBuyers;
    private int counter;
    private String comment;

    public Hour(int numOfBuyers, int counter, String comment) {
        this.numOfBuyers = numOfBuyers;
        this.comment = comment;
        this.counter = counter;
    }

    public Hour() {
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
        return "Num of buyers : " + numOfBuyers + " ,Hour : " + counter + " , Comment : " + comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
