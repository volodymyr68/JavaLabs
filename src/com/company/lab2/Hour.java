package com.company.lab2;

public class Hour extends AbstractHours  {

    public int numOfBuyers;
    public int workHours;
    public String comment;

    public Hour(int numOfBuyers, int counter, String comment) {
        this.numOfBuyers = numOfBuyers;
        this.workHours = counter;
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
    public int getWorkHours() {
        return workHours;
    }

    @Override
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment=comment;
    }

}
