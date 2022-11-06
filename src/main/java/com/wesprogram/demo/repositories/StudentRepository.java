package com.wesprogram.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesprogram.demo.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
