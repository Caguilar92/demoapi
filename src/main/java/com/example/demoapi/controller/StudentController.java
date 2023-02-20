package com.example.demoapi.controller;

import com.example.demoapi.models.Student;
import com.example.demoapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Candelario Aguilar Torres
 **/
@CrossOrigin("*")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/students/filter")
    public ResponseEntity<Student> findStudentBy(@RequestParam String field, @RequestParam String value) {
        Student student = null;
        switch (field) {
            case "firstname":
                student = studentService.findStudentByfirstName(value);
                break;

            case "lastname":
                student = studentService.findStudentByLastName(value);
                break;

            case "studentid":
                student = studentService.findStudentById(Integer.parseInt(value));
                break;
        }
        if(student == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(student);
        }

    }
}
