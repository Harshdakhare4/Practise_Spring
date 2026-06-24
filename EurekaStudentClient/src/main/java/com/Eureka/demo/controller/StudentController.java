package com.Eureka.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eureka.demo.data.Student;

import java.util.*;

@RestController
public class StudentController {
	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> stdLst  = new ArrayList<>();
		
		Student std1 = new Student(101, "Harsh","CSE",99);
		Student std2 = new Student(102, "Ajay","IT",95);
		Student std3 = new Student(103, "Himanshu","CSE-AIML",96);
		
		stdLst.add(std1);
		stdLst.add(std2);
		stdLst.add(std3);
		return new ResponseEntity<>(stdLst,HttpStatus.OK);
	}
	
}
