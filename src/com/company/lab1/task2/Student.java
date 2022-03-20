package com.company.lab1.task2;

public class Student extends Citizen {

    private String universityName;
    private String universityGradeNumber;

    public Student(String name, int age, double weight, double height, String citizenship, String university, String universityGradeNumber) {
        super(name, age, weight, height, citizenship);
        this.universityName = university;
        this.universityGradeNumber = universityGradeNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityGradeNumber() {
        return universityGradeNumber;
    }

    public void setUniversityGradeNumber(String universityGradeNumber) {
        this.universityGradeNumber = universityGradeNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", university='" + universityName + '\'' +
                ", yearOfUniversity='" + universityGradeNumber + '\'' +
                '}';
    }
}
