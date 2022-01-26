package com.company.lab1;

public class store {

    private Hour[] hours = new Hour[3];
    private int buyers;
    private String name;
    private String address;

    public Hour[] getHours() {
        return hours;
    }

    public void setHours(Hour[] hours) {
        this.hours = hours;
    }

    public int getBuyers() {
        return buyers;
    }

    public void setBuyers(int buyers) {
        this.buyers = buyers;
    }

    public store() {
    }

    public store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Store name : ");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Store address : ");
        this.address = address;
    }
}

