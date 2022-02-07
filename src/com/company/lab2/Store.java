package com.company.lab2;
import java.util.Scanner;

public class Store extends AbstractStore  {

    private final Scanner in = new Scanner(System.in);
    private String address;
    private String name;
    private int buyersCount;
    private  Hour [] hours = new Hour[3] ;
    private int buyersSum =0;

    public Store(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public int getBuyersSum() {
        return buyersSum;
    }

    public void setBuyersSum(int buyersSum) {
        this.buyersSum = buyersSum;
    }

    public void fillHours() {

        for (int i = 0; i < getHours().length;i++) {
            System.out.print("Enter quantity of buyers,hour,comment : ");
            getHours()[i] = new Hour(in.nextInt(), in.nextInt(), in.next());
            System.out.println(getHours()[i]);
        }
    }

    @Override
    public Hour[] getHours() {
        return hours;
    }

    @Override
    public void setHours(Hour []hours) {
        this.hours=hours;
    }


    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address=address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public int getBuyersCount() {
        return buyersCount;
    }


    @Override
    public void setBuyersCount(int buyers) {
        this.buyersCount =buyers;
    }

}
