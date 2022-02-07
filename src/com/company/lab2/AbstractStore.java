package com.company.lab2;

import java.util.Objects;

abstract class
AbstractStore  {

    public abstract Hour[] getHours() ;
    public abstract void setHours(Hour []hours);

    public abstract String getAddress();

    public abstract void setAddress(String address);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getBuyers();

    public abstract void setBuyers(int buyers);

    @Override
    public String toString() {
        return "AbstractStore{" +
                "address='" + getAddress() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return getBuyers() == store.getBuyers();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBuyers());
    }

}
