package com.driver;

public class Student {



    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    private double averageScore;
    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public Student(){
    }

    public Student(String name , int age , double avgScore) {
        this.name = name;
        this.age = age;
        this.averageScore = avgScore;
    }


}
