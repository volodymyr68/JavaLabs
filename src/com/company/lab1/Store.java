package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Store {
    Scanner in = new Scanner(System.in);
    public String name;
    public String address;
    public int buyers;

    public Store() {
    }

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // public hour arr[]= new hour[5];
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Назву кіоску : ");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Адреса кіоску : ");
        this.address = address;
    }

    Hour [] arr = new Hour[3];

    public void fillArray() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введіть кількість покупців,годину,та коментар : ");
            arr[i] = new Hour(in.nextInt(), in.nextInt(), in.next());
            System.out.println(arr[i]);
        }

    }

    public void showArray() {
        for (Hour hour : arr) {
            System.out.println(hour.getNumofbuyers() + "\t" + hour.getComment());
        }
    }

    public void buyersSum() {
        System.out.print("Загальна кількість покупців : ");
        for (Hour hour : arr) {
            this.buyers += hour.numofbuyers;
        }
        System.out.println(this.buyers);
    }

    public void smallestHour() {
        System.out.println("Година з найменшою кількістю покупців : ");
        Hour hour = Stream.of(arr)
                .min(Comparator.comparingInt(Hour::getNumofbuyers))
                .get();

        Arrays.sort(arr, Comparator.comparingInt(Hour::getNumofbuyers));
        // System.out.println(hour.numofbuyers);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].numofbuyers == hour.numofbuyers) {
                System.out.println(arr[i].counter + " : 00");
                System.out.println("Коментар покупців : " + arr[i].comment);
            }

        }
    }
}