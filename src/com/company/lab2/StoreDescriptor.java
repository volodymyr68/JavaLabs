package com.company.lab2;

public class StoreDescriptor {

    public void operationsOutput(Store store, StoreOperations operations) {

        System.out.println("Total count of buyers : " + operations.getBuyersSum());
        System.out.println("Hour with smallest quantity of buyers : " + operations.findSmallestHour(store) + " : 00");
        System.out.println("Buyers comment : " + operations.findComment(store));

    }

    public void arraySortOutput(Store store,  HourOperations hour1){
        
        System.out.println("Sorted array by buyers/comment: ");
        int i=0;
        while (i<store.getHours().length){
            System.out.println(store.getHours()[i]);
            i++;
        }
    }
}
