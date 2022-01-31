package com.company.lab2;


import java.util.ArrayList;

public class StoreDescriptor {
    public ArrayList<Hour> ar = new ArrayList<Hour>();
    public void output(Store store, StoreOperations operations,HourOperations hour1) {
        System.out.println("Total count of buyers : " + operations.getBuyersSum());
        System.out.println("Hour with smallest quantity of buyers : " + operations.findSmallestHour(store) + " : 00");
        System.out.println("Buyers comment : " + operations.findComment(store));
        for(Hour hour: store.getHours()){
            System.out.println(hour);
        }
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
