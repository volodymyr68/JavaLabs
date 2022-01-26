package com.company.lab1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class StoreOperations {
    private final Scanner in = new Scanner(System.in);

    public void fillArray(Store store) {

        for (int i = 0; i < store.getArr().length; i++) {
            System.out.print("Enter quantity of buyers,hour,comment : ");
            store.getArr()[i] = new Hour(in.nextInt(), in.nextInt(), in.next());
            System.out.println(store.getArr()[i]);
        }
    }

    public void buyersSum(Store store) {
        for (Hour hour : store.getArr()) {
            store.setBuyers(store.getBuyers() + hour.getNumOfBuyers());
        }
    }

    public void smallestHour(Store store) {

        Hour hour = Stream.of(store.getArr())
                .min(Comparator.comparingInt(Hour::getNumOfBuyers))
                .get();
        Arrays.sort(store.getArr(), Comparator.comparingInt(Hour::getNumOfBuyers));

    }
}




