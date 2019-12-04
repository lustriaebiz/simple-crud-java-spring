package com.cakap.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakap.student.domain.Student;
import com.cakap.student.repository.StudentRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentService {
	
	@NonNull
	private StudentRepository repository;
	
	public List<Student> getAllStudent() {
		return repository.findAll();
	}
	
	public Student getStudentById(Long id) {
		return repository.findById(id).get();
	}
}
