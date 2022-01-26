package com.company.lab1;

public class StoreDescriptor   {

    public void output(Store store){
        System.out.println("Total count of buyers : "+ store.getBuyers());
        System.out.println("Hour with smallest quantity of buyers : "+ store.getArr()[0].getCounter() + " : 00");
        System.out.println("Buyers comment : " + store.getArr()[0].getComment());
    }

}
