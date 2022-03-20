package com.company.lab2.task3;

public class Main {
    public static void main(String[] args) {

        MyArray a = new MyArray("penis", "1", "2", "3", "zalupa");
        a.superSwap(a.getArr());
        System.out.println(a);     // 1 New
        MyArray b = new MyArray(5);
        b.set(0, 1.0);
        b.set(1, 2.0);
        b.set(2, 4.0);
        b.set(3, 9.0);
        b.set(4, 0.0);
        b.swap(b.getArr(), 0, 2);
        System.out.println(b);
        b.arraySwap(b.getArr());
        System.out.println(b);
    }
}

