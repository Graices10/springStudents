package ru.SPCourse.springStudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("/save_student")
    public StudentModel saveStudent(@RequestBody StudentModel studentModel){
        return studentService.saveStudent(studentModel);
    }
    @GetMapping("/{email}")
    public StudentModel findByEmail(@PathVariable String email){
        return studentService.findByEmail(email);
    }
    @PutMapping("/update_student")
    public StudentModel updateStudent(@RequestBody StudentModel studentModel){
        return studentService.updateStudent(studentModel);
    }
    @DeleteMapping("/delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        studentService.deleteStudent(email);
    }

}
