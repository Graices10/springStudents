package ru.SPCourse.springStudents.service;

import org.springframework.stereotype.Service;
import ru.SPCourse.springStudents.model.StudentModel;

import java.util.List;


public interface StudentService {

    List<StudentModel> findAllStudents();

}
