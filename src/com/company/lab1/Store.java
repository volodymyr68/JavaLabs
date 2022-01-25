package com.company.lab1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Store {

    private Scanner in = new Scanner(System.in);
    private String name;
    private String address;
    private int buyers;
    private Hour[] arr = new Hour[3];

    public Store() {
    }

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Store name : ");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Store address : ");
        this.address = address;
    }



    public void fillArray() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter quantity of buyers,hour,comment : ");
            arr[i] = new Hour(in.nextInt(), in.nextInt(), in.next());
            System.out.println(arr[i]);
        }
    }

    public void showArray() {
        for (Hour hour : arr) {
            System.out.println(hour.getNumOfBuyers() + "\t" + hour.getComment());
        }
    }

    public void buyersSum() {
        System.out.print("Total count of buyers : ");
        for (Hour hour : arr) {
            this.buyers += hour.getNumOfBuyers();
        }
        System.out.println(this.buyers);
    }

    public void smallestHour() {
        System.out.println("Hour with smallest quantity of buyers : ");
        Hour hour = Stream.of(arr)
                .min(Comparator.comparingInt(Hour::getNumOfBuyers))
                .get();

        Arrays.sort(arr, Comparator.comparingInt(Hour::getNumOfBuyers));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNumOfBuyers() == hour.getNumOfBuyers()) {
                System.out.println(arr[i].getCounter() + " : 00");
                System.out.println("Buyers comment : " + arr[i].getComment());
            }

        }
    }
}
