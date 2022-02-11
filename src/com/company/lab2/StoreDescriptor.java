package com.company.lab2;

public class StoreDescriptor {

    public void operationsOutput(Store store, StoreOperations operations) {
        System.out.println("Total count of buyers : " + operations.getBuyersSum());
        System.out.println("Hour with smallest quantity of buyers : " + operations.findSmallestHourWorkHours(store) + " : 00");
        System.out.println("Buyers comment : " + operations.findSmallestHourComment(store));

    }

    public void arraySortOutput(Store store){
        System.out.println("Sorted array by buyers/comment: ");
        for (Hour hour : store.getHours()) {
            System.out.println(hour);

        }
    }

}
