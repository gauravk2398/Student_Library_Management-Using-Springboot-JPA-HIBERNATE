package com.example.Student_Library_Management.Controller;

import com.example.Student_Library_Management.Model.Student;
import com.example.Student_Library_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
