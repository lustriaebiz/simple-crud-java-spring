package com.cakap.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") Long id) {
		return service.getStudentById(id);
	}

}
