package ru.SPCourse.springStudents.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class StudentModel {

    private String firstName;
    private String surname;
    private LocalDate dateOfBirth;
    private String email;
    private int age;
}
