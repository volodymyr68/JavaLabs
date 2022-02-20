package com.company.lab1.task3;

public class BodyOfFunction extends AbstractBodyOfFunction{

    private double leftX;
    private double leftY;
    private double rightX;
    private double rightY;

    public BodyOfFunction(double leftX, double rightX) {
        this.leftX = leftX;
        this.rightX = rightX;
    }

    @Override
    public double getLeftX() {
        return leftX;
    }

    @Override
    public void setLeftX(double leftX) {
        this.leftX=leftX;
    }

    @Override
    public double getLeftY() {
        return leftY;
    }

    @Override
    public void setLeftY(double leftY) {
        this.leftY=leftY;
    }

    @Override
    public double getRightX() {
        return rightX;
    }

    @Override
    public void setRightX(double rightX) {
        this.rightX=rightX;
    }

    @Override
    public double getRightY() {
        return rightY;
    }

    @Override
    public void setRightY(double rightY) {
        this.rightY=rightY;
    }
}
