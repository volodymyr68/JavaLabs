package com.company.lab2.task2;

enum Months{
    January(31,"winter"),
    February(28,"winter"),
    March(31,"spring"),
    April(30,"spring"),
    May(31,"spring"),
    June(30,"summer"),
    July(31,"summer"),
    August(31,"summer"),
    September(30,"autumn"),
    October(31,"autumn"),
    November(30,"autumn"),
    December(31,"winter");

    private int days;
    private String season;

    public int getDays() {
        return days;
    }

    public String getSeason() {
        return season;
    }

    Months(int days, String season) {
        this.days = days;
        this.season = season;
    }
    @Override
    public String toString() {
        return name() + " (season : " + season + ")  (days : "+days+")";
    }

}
public class MonthOutPut {

    public void outPut(){
        System.out.println(Months.valueOf("April"));
        System.out.println(("__________________________________"));
        for (int i = 0; i < Months.values().length; i++) {
            System.out.println(Months.values()[i]);
        }
    }
}
