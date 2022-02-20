package com.company.lab1.task5;

public class Main {
    public static void main(String[] args) {

        Integral lol = new Integral();
        System.out.println(lol.integral(0.0, 5.0, 10000000, x -> ((x*x*x))));
    }
}
