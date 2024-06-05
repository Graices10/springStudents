package ru.SPCourse.springStudents.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.SPCourse.springStudents.model.StudentModel;
import ru.SPCourse.springStudents.repository.InMemoryStudentDAO;
import ru.SPCourse.springStudents.service.StudentService;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentImplService implements StudentService {

    private final InMemoryStudentDAO inMemoryStudentDAO;
    @Override
    public List<StudentModel> findAllStudents() {
        return inMemoryStudentDAO.findAllStudents();
    }

    @Override
    public StudentModel saveStudent(StudentModel studentModel) {
        return inMemoryStudentDAO.saveStudent(studentModel);
    }

    @Override
    public StudentModel findByEmail(String email) {
        return inMemoryStudentDAO.findByEmail(email);
    }

    @Override
    public StudentModel updateStudent(StudentModel studentModel) {
        return inMemoryStudentDAO.updateStudent(studentModel);
    }

    @Override
    public void deleteStudent(String email) {
        inMemoryStudentDAO.deleteStudent(email);

    }
}
