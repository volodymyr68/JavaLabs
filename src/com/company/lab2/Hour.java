package com.company.lab2;

import java.util.Comparator;

public class Hour extends AbstractHours implements Comparator<Hour> {
        public int numOfBuyers;
        public int counter;
        public String comment;


    public Hour(int numOfBuyers, int counter, String comment) {
        this.numOfBuyers = numOfBuyers;
        this.counter = counter;
        this.comment = comment;
    }
    public Hour(){}

    @Override
    public int getNumOfBuyers() {
        return numOfBuyers;
    }

    @Override
    public void setNumOfBuyers(int numOfBuyers) {
        this.numOfBuyers=numOfBuyers;
    }

    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public void setCounter(int counter) {
        this.counter=counter;
    }

    @Override
    public String getComment() {
        return comment;
    }

//    @Override
//    public static String getComment() {
//        return comment;
//    }


    @Override
    public void setComment(String comment) {
        this.comment=comment;
    }


    @Override
    public int compare(Hour o1, Hour o2) {
        return this.getCounter()-getCounter();
    }
}