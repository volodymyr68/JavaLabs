package com.company.lab1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class StoreOperations {


    private final Scanner in = new Scanner(System.in);
    private int buyersSum =0;

    public int getBuyersSum() {
        return buyersSum;
    }

    public void fillHours(store store) {

        for (int i = 0; i < store.getHours().length; i++) {
            System.out.print("Enter quantity of buyers,hour,comment : ");
            store.getHours()[i] = new Hour(in.nextInt(), in.nextInt(), in.next());
            System.out.println(store.getHours()[i]);
        }
    }

    public int calculateBuyersSum(store store) {

        for (Hour hour : store.getHours()) {
            buyersSum += hour.getNumOfBuyers();
        }
        return buyersSum;
    }

    public int findSmallestHour(store store) {

        Hour hour = Stream.of(store.getHours())
                .min(Comparator.comparingInt(Hour::getNumOfBuyers))
                .get();
        return hour.getNumOfBuyers();
    }
    public String findComment(store store) {

        Hour hour = Stream.of(store.getHours())
                .min(Comparator.comparingInt(Hour::getNumOfBuyers))
                .get();
        return hour.getComment();
    }
}




