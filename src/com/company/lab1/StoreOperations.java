package com.company.lab1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class StoreOperations {
    private final Scanner in = new Scanner(System.in);

    public void fillHours(Store store) {

        for (int i = 0; i < store.getArr().length; i++) {
            System.out.print("Enter quantity of buyers,hour,comment : ");
            store.getArr()[i] = new hour(in.nextInt(), in.nextInt(), in.next());
            System.out.println(store.getArr()[i]);
        }
    }

    public int calculateBuyersSum(Store store) {
        for (com.company.lab1.hour hour : store.getArr()) {
            store.setBuyers(store.getBuyers() + hour.getNumOfBuyers());
        }
        return store.getBuyers();
    }

    public hour findSmallestHour(Store store) {

        hour hour = Stream.of(store.getArr())
                .min(Comparator.comparingInt(com.company.lab1.hour::getNumOfBuyers))
                .get();
        Arrays.sort(store.getArr(), Comparator.comparingInt(com.company.lab1.hour::getNumOfBuyers));
        return hour;

    }
}




