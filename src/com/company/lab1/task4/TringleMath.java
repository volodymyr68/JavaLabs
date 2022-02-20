package com.company.lab1.task4;

import static java.lang.Math.sqrt;

import java.util.Arrays;
import java.util.Comparator;

public class TringleMath {

    public double tringleSquare(Tringle tringle) {
        int a = tringle.getA();
        int b = tringle.getB();
        int c = tringle.getC();
        double sqrt = sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a));
        double res = 0.25 * sqrt;
        return res;
    }

    public void sort(Tringle t[]) {
        Arrays.sort(t, Comparator.comparingDouble(Tringle::getSquare));

    }
}
