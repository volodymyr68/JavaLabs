package com.company.lab1.task2;

public class Student extends Citizen {

    private String universityName;
    private String yearOfUniversity;

    public Student(String name, int age, double weight, double height, String citizenship, String university, String yearOfUniversity) {
        super(name, age, weight, height, citizenship);
        this.universityName = university;
        this.yearOfUniversity = yearOfUniversity;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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
                ", university='" + universityName + '\'' +
                ", yearOfUniversity='" + yearOfUniversity + '\'' +
                '}';
    }
}
