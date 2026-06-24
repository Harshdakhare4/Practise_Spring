package com.Eureka.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.Eureka.demo.data.Student;

import java.util.*;

@FeignClient (name= "STUDENT:8081")
public interface FeignClientForStudent {

	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudentsFromStudentMicroservice();
}
