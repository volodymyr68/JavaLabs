package com.company.lab2;


public  class Main {
    public static void main(String[] args) {
        Store Store = new Store("ATB", "Pushka");

    StoreOperations operations = new StoreOperations();
    Hour hour = new Hour();
        System.out.println(Store.getName());
        System.out.println(Store.getAddress());
        operations.fillHours(Store);
        operations.calculateBuyersSum(Store);
        operations.findSmallestHour(Store);
    StoreDescriptor store1 = new StoreDescriptor();
    HourOperations hourOperations=new HourOperations();
        hourOperations.sortHoursByBuyers(Store);
        store1.output(Store, operations,hourOperations);
        hourOperations.compare(hour,hour);
        store1.output(Store, operations,hourOperations);
    }
}
