package com.crudapp.app.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.app.models.StudentModel;
import com.crudapp.app.repositories.StudentRepository;

@RestController
public class StudentController {
	
//	StudentRepository repo = new StudentRepository();
	@Autowired
	StudentRepository repo;
	
	@PostMapping("/student/register")
	public String registerUser(@RequestBody StudentModel newStudent) {
		try {
			 repo.createStudent(newStudent);
			 return "Registration Successful";
		} catch (Exception e) {
			return "Registration Failed";
		}
		
	}
	
	@PostMapping("/student/login")
	public String loginUser(@RequestBody Map<String, String> loginUser) {
		StudentModel user = repo.loginUser(loginUser);
		if(user != null) {
			return "Login Success";
		}else {
			return "Login Failed";
		}
	}
	
	public void updateUser() {
		
	}
	
	public void deleteUser() {
		
	}
	
	@GetMapping("/student/show_all")
	public ArrayList<StudentModel> showAll() {
		return repo.showAll();
	}
	
	@GetMapping("/student/show_one/{id}")
	public StudentModel showOne(@PathVariable long id) {
		return repo.showOne(id);
	}
}
