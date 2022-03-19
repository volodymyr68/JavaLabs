package com.company.lab2.task3;

public class Main {
    public static void main(String[] args) {

        MyArray<String> a = new MyArray<>("penis", "1", "2", "3", "zalupa");
        a.SuperSwap(a.getArr());
        System.out.println(a);     // 1 New
        MyArray<Double> b = new MyArray<>(5);
        b.set(0, 1.0);
        b.set(1, 2.0);
        b.set(2, 4.0);
        b.set(3, 9.0);
        b.set(4, 0.0);
        b.Swap(b.getArr(), 0, 2);
        System.out.println(b);
        b.ArraySwap(b.getArr());
        System.out.println(b);
    }
}

