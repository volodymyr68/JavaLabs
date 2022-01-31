package com.company.lab2;

import java.util.Objects;

abstract class  AbstractHours  {


    public abstract int getNumOfBuyers();

    public  abstract void setNumOfBuyers(int numOfBuyers);

    public abstract int getCounter();

    public abstract void setCounter(int counter);



    public abstract String getComment();

    public abstract void setComment(String comment) ;


    @Override
    public String toString() {
        return
                "Buyers quantity : " + getNumOfBuyers() +
                ", Hour : " + getCounter() +":00"+
                ", Buyers comment : " + getComment()  ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hour hour = (Hour) o;
        return Objects.equals(getComment(), hour.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getComment());
    }

}

