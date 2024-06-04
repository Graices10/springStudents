package ru.SPCourse.springStudents.impl;

import org.springframework.stereotype.Service;
import ru.SPCourse.springStudents.model.StudentModel;
import ru.SPCourse.springStudents.service.StudentService;

import java.util.List;
@Service
public class InMemoryStudentImplService implements StudentService {
    @Override
    public List<StudentModel> findAllStudents() {
        return List.of(
                StudentModel.builder().firstName("Ilya").age(19).email("Ilya.graices@gmail.com").build(),
                StudentModel.builder().firstName("Elena").age(21).email("Elena@gmail.com").build(),
                StudentModel.builder().firstName("Pavel").age(25).email("Pavel.Savin@gmail.com").build()
        );
    }
}
