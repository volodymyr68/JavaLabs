package com.company.lab1.task2;

public class Citizens extends Human {
    private String citizenship;

    public Citizens(String name, int age, double weight, double height,String citizenship) {
        super(name, age, weight, height);
        this.citizenship=citizenship;
    }


    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return "Citizens{" +
                "citizenship='" + citizenship + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
