package com.spring.jpaexample.repository;

import com.spring.jpaexample.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
