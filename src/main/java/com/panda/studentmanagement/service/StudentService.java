package com.panda.studentmanagement.service;

import com.panda.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Student student, Long id);
    void deleteStudent(Long id);
}
