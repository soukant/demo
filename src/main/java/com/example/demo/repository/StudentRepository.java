package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Student;
import java.util.List;


public interface StudentRepository extends JpaRepository<Student,String> {

    Student findBycode (String code);
    List<Student> findByProgramId(String programId);
}
