package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherDB teacherDb;
    public void addStudent(Student studentObj) {
        studentRepository.addStudentToList(studentObj);
    }

    public void addPair(String student , String teacher) {
        ArrayList<String> listOfStudents = teacherDb.pairs.getOrDefault(teacher , new ArrayList<>());

        listOfStudents.add(student);
//        System.out.println("teacher") ;
//        System.out.println(listOfStudents) ;
        teacherDb.pairs.put(teacher , listOfStudents);
    }

    public Student getStudent(String name) {

        return studentRepository.getStudent(name);
    }

    public List<String> getAllStudents(){

        return studentRepository.getNamesOfStudents();
    }

    public void deleteTeacherFromDB(String teacher){
        teacherDb.removeTeacher(teacher);
    }

    public  void removeStudent(String student) {
        studentRepository.removeStudent(student);
    }

    public void deleteDB() {
        teacherDb.deleteAll();
    }
}
