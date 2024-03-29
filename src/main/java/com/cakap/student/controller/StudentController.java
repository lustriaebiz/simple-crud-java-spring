package com.cakap.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cakap.student.domain.Student;
import com.cakap.student.service.StudentService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentController {
	
	@NonNull
	private StudentService service;
	
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") Long id) {
		return service.getStudentById(id);
	}
	
	@PostMapping("/add-student")
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@DeleteMapping("/delete-student/{id}")
	public List<Student> deleteStudent(@PathVariable("id") Long id) {
		return service.deleteStudent(id);
	}
	
	@PutMapping("/update-student/{id}")
	public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		return service.updateStudent(id, student);
	}

}
