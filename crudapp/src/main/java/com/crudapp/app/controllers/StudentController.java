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
import com.crudapp.app.repositories.AuthRepository;
import com.crudapp.app.repositories.StudentRepository;

@RestController
public class StudentController {
	
//	StudentRepository repo = new StudentRepository();
	@Autowired
	StudentRepository repo;
	@Autowired
	AuthRepository authRepo;
	
	//Register
	
	@PostMapping("/user/register")
	public String studentRegister(@RequestBody StudentModel newStudent) {
		long id = newStudent.getUid();
		long rollNo = newStudent.getRollNo();
		String name = newStudent.getName();
		String course = newStudent.getCourse();
		String branch = newStudent.getBranch();
		String email = newStudent.getEmail();
		String pass = newStudent.getPass();
		StudentModel newStu = repo.register(id, rollNo, name, course, branch, email, pass);
		if(newStu != null) {
			return "Registration Successful";
		}
		return "Registration Failed.";
	}
	
	//Login
	
	@PostMapping("/user/login")
	public String login(@RequestBody Map<String, String> loginUser) {
		long id =  Long.parseLong(loginUser.get("id"));
		String email = loginUser.get("email");
		String pass = loginUser.get("pass");
		StudentModel login = repo.login(id, email, pass);
		if(login != null) {
			return "Login Successful";
		}
		return "Login Failed.";
	}
	//Reset Password
	
	//View Attendance
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//	@GetMapping("/student/show_all")
//	public ArrayList<StudentModel> showAll() {
//		return repo.showAll();
//	}
//	
//	@GetMapping("/student/show_one/{id}")
//	public StudentModel showOne(@PathVariable long id) {
//		return repo.showOne(id);
//	}
}
