package com.company.lab1;
public class Main {

    public static void main(String[] args) {

        Store Store =new Store("ATB","Pushka");

        StoreOperations operations = new StoreOperations();
        System.out.println(Store.getName());
        System.out.println(Store.getAddress());
        operations.fillArray(Store);
        operations.buyersSum(Store);
        operations.smallestHour(Store);

        StoreDescriptor store1 = new StoreDescriptor();
        store1.output(Store);


    }
}
