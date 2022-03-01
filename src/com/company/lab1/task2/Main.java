package com.company.lab1.task2;

public class Main {

    public static void main(String[] args) {

        Object []arr=new Object[4];
            arr[0] =new Human("Vova",17,74.5,185);
            arr[1]= new Citizen("Vova",17,74.5,185,"Ukraine");
            arr[2] = new Employee("Vova",17,74.5,185,"Ukraine","Nix Solution","junior");//
            arr[3] = new Student("Vova",17,74.5,185,"Ukraine","KHPI","1 grade");
        for (Object ar : arr) {
            System.out.println(arr);
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

    }
}
