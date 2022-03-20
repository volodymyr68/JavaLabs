package com.company.lab2.task3;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

    Scanner p= new Scanner(System.in);
    private Object[] arr ;

    public MyArray(Object... arr) {
        this.arr = arr;
    }

    public Object[] getArr() {
        return arr;
    }

    public MyArray(int size) {
        arr = new Object[size];
    }

    public int size() {
        return arr.length;
    }

    public Object get(int i) {
        return (Object)arr[i];
    }

    public void set(int i, Object t) {
        arr[i] = t;
    }

    public void swap(Object []arr, int a, int b){
        Object temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public void superSwap(Object []arr){
        for (int i = 0; i < arr.length-1; i++)
        {
            swap(arr,i,i+1);
        }
    }

    public void arraySwap(Object []arr){
        for (int i = 0; i < arr.length; i++) {
        arr[i]=p.nextInt();
        }

    }


    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}
