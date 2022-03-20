package com.company.lab1.task4;

public class Tringle {

    private int a;
    private int b;
    private int c;
    private double square;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Tringle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Tringle(int a, int b, int c, double square) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.square = square;
    }

    @Override
    public String toString() {
        return "Tringle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", square=" + square +
                '}';
    }
}
