package com.student.information.system.studentinformationsystem.service;

import com.student.information.system.studentinformationsystem.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student findByStudentNumber(long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpa();

    void saveOrUpdateStudent(Student student);

    void deleteStudent(String id);

}
