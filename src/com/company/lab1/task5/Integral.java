package com.company.lab1.task5;

public class Integral implements  Integrable{

    @Override
    public double integral(double a, double b, double precision, Function f) {
        return Integrable.super.integral(a, b, precision, f);
    }
}
