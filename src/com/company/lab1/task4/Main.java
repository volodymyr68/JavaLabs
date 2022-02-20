package com.company.lab1.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TringleMath math = new TringleMath();
        Tringle[] t = new Tringle[3];
        for (int i = 0; i < 3; i++) {
            t[i] = new Tringle(in.nextInt(), in.nextInt(), in.nextInt());
            double calculatedSquare = math.tringleSquare(t[i]);
            t[i].setSquare(calculatedSquare);
        }
        math.sort(t);
        for (int i = 0; i < 3; i++) {
            System.out.println(t[i]);
        }
    }
}
