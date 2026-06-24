package com.Eureka.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Eureka.demo.data.Student;

@RestController
public class MyController {

	@Autowired
	FeignClientForStudent feignClientForStudent;
	
	@GetMapping("/getAllDataFromMicroservice")
	public ResponseEntity<List<Student>> getAllDataFromMicroservice(){
		ResponseEntity<List<Student>> stuLst = feignClientForStudent.getAllStudentsFromStudentMicroservice();
				
		return stuLst;
	}
	
}
