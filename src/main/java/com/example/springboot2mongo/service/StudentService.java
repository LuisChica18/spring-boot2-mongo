package com.example.springboot2mongo.service;

import com.example.springboot2mongo.dto.StudentDto;
import com.example.springboot2mongo.dto.StudentExistingDto;
import com.example.springboot2mongo.dto.StudentNewDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    StudentDto addStudent(StudentNewDto studentNewDto);

    StudentDto updateStudent(StudentExistingDto studentExistingDto);

    void deleteStudent(String studentId);

    StudentDto getStudentById(String studentId);

    Page<StudentDto> getAllStudents(Pageable pageable);
}
