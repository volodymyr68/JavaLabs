package com.company.lab1.task2;

public class Employee extends Citizen {

    private String company;
    private String workPosition;

    public Employee(String name, int age, double weight, double height, String citizenship,String company,String workPosition) {
        super(name, age, weight, height, citizenship);
        this.company=company;
        this.workPosition=workPosition;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", workPosition='" + workPosition + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
