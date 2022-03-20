package com.company.lab1.task5;

public interface Integrable {

    public default double integral(double a, double b, double precision, Function function) {
        double w = (b - a) / precision;
        double sum = 0;
        double x;
        for (int i = 1; i <= precision; i++) {
            x = a + (i - 1) * w;
            sum = sum + (w * (function.function(x)));   //1/ln()x
        }
        return sum;
    }

}
