package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    public HashMap<String ,Student> students = new HashMap<>();

    //to add students in to out db
    public void addStudentToList(Student studentObj) {
        students.put(studentObj.getName() ,studentObj ) ;
    }

    public Student getStudent(String name) {
        return students.getOrDefault(name , null);
    }

    public List<String> getNamesOfStudents() {
        List<String> list = new ArrayList<>();
        for(String st : students.keySet()) {
            list.add(st) ;
        }
        return list;
    }

    public void removeStudent(String student) {
        students.remove(student);
    }

}
