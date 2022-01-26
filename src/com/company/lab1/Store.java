package com.company.lab1;

public class Store {

    private hour[] arr = new hour[3];
    private int buyers;
    private String name;
    private String address;

    public hour[] getArr() {
        return arr;
    }

    public void setArr(hour[] arr) {
        this.arr = arr;
    }

    public int getBuyers() {
        return buyers;
    }

    public void setBuyers(int buyers) {
        this.buyers = buyers;
    }

    public Store() {
    }





    public Store(String name, String address) {
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

