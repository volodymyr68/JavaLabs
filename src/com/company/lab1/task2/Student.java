package com.company.lab1.task2;

public class Student extends Citizens {

    private String university;
    private String yearOfUniversity;

    public Student(String name, int age, double weight, double height, String citizenship, String university, String yearOfUniversity) {
        super(name, age, weight, height, citizenship);
        this.university = university;
        this.yearOfUniversity = yearOfUniversity;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYearOfUniversity() {
        return yearOfUniversity;
    }

    public void setYearOfUniversity(String yearOfUniversity) {
        this.yearOfUniversity = yearOfUniversity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", university='" + university + '\'' +
                ", yearOfUniversity='" + yearOfUniversity + '\'' +
                '}';
    }
}
