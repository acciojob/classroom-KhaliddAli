package com.driver;

import java.util.ArrayList;
import java.util.HashMap;

public class Teacher {


    private String name;

    private int numberOfStudents;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher() {

    }

    public Teacher(String name , int age , int numberOfStudents) {
        this.name = name;
        this.age = age;
        this.numberOfStudents = numberOfStudents;

    }
}