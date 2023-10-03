package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class TeacherDB {
    public HashMap<String , ArrayList<String>> pairs = new HashMap<>();

    public HashMap<String , Teacher> listOfTeachers = new HashMap<>();

    public void addTeacherToDB(Teacher teacher){
        listOfTeachers.put(teacher.getName() , teacher) ;
    }
    public Teacher getTeacher(String name) {
        return listOfTeachers.getOrDefault(name , null) ;
    }

    public ArrayList<String> getStudentsOfTeacher(String teacher) {
//        System.out.println(pairs.getOrDefault(teacher , new ArrayList<>()));
        return pairs.getOrDefault(teacher , new ArrayList<>());
    }

    public void removeTeacher(String teacher) {
        listOfTeachers.remove(teacher);
        pairs.remove(teacher);
    }
    public void deleteAll() {
        listOfTeachers = new HashMap<>();
        pairs = new HashMap<>();
    }
}
