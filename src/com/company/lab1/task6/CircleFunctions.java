package com.company.lab1.task6;
 import java.util.Arrays;
 import java.util.Scanner;
public class CircleFunctions  {
    private final Scanner in = new Scanner(System.in);
    private Circle[] circleAreas = new Circle[5];

    public Circle[] getCircleAreas() {
        return circleAreas;
    }

    public void setCircleAreas(Circle[] circleAreas) {
        this.circleAreas = circleAreas;
    }

    public void inputAreas(){
        for (int i = 0; i < getCircleAreas().length; i++) {
            circleAreas[i]= new Circle (in.nextInt());
        }
    }
    public void sorting(){
         Arrays.sort(circleAreas);
    }


}
