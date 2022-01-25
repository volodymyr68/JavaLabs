package com.company;
public class Main {

    public static void main(String[] args) {
        Store Store =new Store("ATB","Pushka");
        Store store1 = new Store();

        System.out.println(Store.getName());
        System.out.println(Store.getAddress());
        Store.fillArray();
        Store.buyersSum();
        Store.smallestHour();


    }
}