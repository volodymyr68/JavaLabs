package com.company.lab1.task3;

import java.text.DecimalFormat;
import static java.lang.Math.cbrt;

public class FunctionOfMin {

   private double tempY;
   private double tempX;

    public FunctionOfMin(double tempY, double tempX) {
        this.tempY = tempY;
        this.tempX = tempX;
    }

    public FunctionOfMin() {
    }

    public void Function(BodyOfFunction Body) {

        DecimalFormat df = new DecimalFormat("###.#");
        double minY=Body.getLeftY();
        double minX=Body.getLeftX();

        tempX=Body.getLeftX();
        while (true){
            if (tempX>=1){
                break;
            }
            if(minY>tempY){
                minY=tempY;
                minX=tempX;
            }
            tempY=tempX*tempX*tempX;
            tempX+=0.1;
        }
        System.out.println("x = "+ df.format(cbrt(minY)) + " y = "+df.format(minY));


    }
}
