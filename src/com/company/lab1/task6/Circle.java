package com.company.lab1.task6;

public class Circle implements Comparable<Circle> {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    @Override
    public int compareTo(Circle o) {
        return this.getRadius() - o.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
