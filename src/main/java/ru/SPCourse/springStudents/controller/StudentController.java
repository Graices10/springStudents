package ru.SPCourse.springStudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.SPCourse.springStudents.model.StudentModel;
import ru.SPCourse.springStudents.service.StudentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentModel> findAllStudents(){
        //todo
        return studentService.findAllStudents();
    }
}
