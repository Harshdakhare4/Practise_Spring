package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	
	public Student saveStudent(Student st) {
		return repo.save(st);
	}
	
	public void deleteStudentById(Integer id) {
		repo.deleteById(id);
	}
	
	public Student updateStudent(Integer id, Student studentDetails) {
        Student student = repo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        return repo.save(student);
    }
}
