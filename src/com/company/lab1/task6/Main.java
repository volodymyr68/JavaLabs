package com.company.lab1.task6;

public class Main {
    public static void main(String[] args) {

        CircleFunctions lol = new CircleFunctions();
        lol.inputAreas();
        lol.sorting();
        System.out.println("Array : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(lol.getCircleAreas()[i]);
        }
    }
}
