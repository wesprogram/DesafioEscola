package com.wesprogram.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wesprogram.demo.entities.Student;
import com.wesprogram.demo.repositories.StudentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = new Student(null, "Allan", "Moreira", 26, 1);
		Student s2 = new Student(null, "Amanda", "Lopes", 20, 1);
		
		
		studentRepository.saveAll(Arrays.asList(s1, s2));
	}
	
}
