package com.example.demoapi;

import com.example.demoapi.models.Student;
import com.example.demoapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApiApplication implements CommandLineRunner {
        @Autowired
        private StudentService studentService;

    public static void main(String[] args) {

        SpringApplication.run(DemoApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentService.addStudent(new Student("John","Smith",156846,3.4));
        studentService.addStudent(new Student("Rebecca","Olivera",197846,4.0));
        studentService.addStudent(new Student("Seth","Powers",138456,2.9));
        studentService.addStudent(new Student("Nina","Avedisian",198132,3.46));
        studentService.addStudent(new Student("Mark","Westfield",265486,3.06));
        studentService.addStudent(new Student("Freddy","Krueger",384568,3.11));
        studentService.addStudent(new Student("Jason","Vorhees",158745,1.92));
        studentService.addStudent(new Student("Samuel","Cuevas",894651,3.39));
        studentService.addStudent(new Student("Jennifer","Rodriguez",584681,3.0));
        studentService.addStudent(new Student("Leslie","Torres",486513,2.5));
    }
}
