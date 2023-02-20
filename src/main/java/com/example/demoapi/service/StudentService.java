package com.example.demoapi.service;

import com.example.demoapi.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Candelario Aguilar Torres
 **/
@Service
public class StudentService {
    List<Student> studentList = new ArrayList<>();

    public StudentService() {

    }
    public void addStudent(Student student) {
        studentList.add(student);

    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    public Student findStudentByfirstName(String firstname) {

        for(Student s : studentList) {
            if(s.getFirstname().equalsIgnoreCase(firstname)) {
                return s;
            }
        }
        return null;
    }


    public Student findStudentByLastName(String lastname) {
        for(Student s : studentList) {
            if(s.getLastname().equalsIgnoreCase(lastname)) {
                return s;
            }
        }
        return null;
    }

    public Student findStudentById(long studentid) {
        for(Student s : studentList) {
            if(s.getStudentId() == studentid) {
                return s;
            }
        }
        return null;
    }
}
