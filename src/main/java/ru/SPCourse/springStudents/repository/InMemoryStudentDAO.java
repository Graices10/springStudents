package ru.SPCourse.springStudents.repository;

import org.springframework.stereotype.Repository;
import ru.SPCourse.springStudents.model.StudentModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {

    private final List<StudentModel> STUDENTS = new ArrayList<>();


    public List<StudentModel> findAllStudents() {
        return STUDENTS;
    }


    public StudentModel saveStudent(StudentModel studentModel) {
        STUDENTS.add(studentModel);
        return studentModel;
    }


    public StudentModel findByEmail(String email) {
        return STUDENTS.stream()
                .filter(el->el.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    public StudentModel updateStudent(StudentModel studentModel) {
        var studentIndex = IntStream.range(0,STUDENTS.size())
                .filter(el->STUDENTS.get(el).getEmail().equals(studentModel.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1){
            STUDENTS.set(studentIndex, studentModel);
            return studentModel;
        }
        return null;
    }


    public void deleteStudent(String email) {
        var student = findByEmail(email);
        if(student!=null){
            STUDENTS.remove(student);
        }
    }
}
