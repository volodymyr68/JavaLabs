package com.company.lab1;

public class StoreDescriptor {

    public void output(store store, StoreOperations operations) {
        System.out.println("Total count of buyers : " + operations.getBuyersSum());
        System.out.println("Hour with smallest quantity of buyers : " + operations.findSmallestHour(store) + " : 00");
        System.out.println("Buyers comment : " + operations.findComment(store));
    }

}
