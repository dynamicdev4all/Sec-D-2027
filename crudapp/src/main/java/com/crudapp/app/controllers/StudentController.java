package com.crudapp.app.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.app.dto.StudentLoginDTO;
import com.crudapp.app.dto.StudentLoginResDTO;
import com.crudapp.app.models.StudentModel;
import com.crudapp.app.repositories.StudentRepository;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class StudentController {
	
//	StudentRepository repo = new StudentRepository();
	@Autowired
	StudentRepository repo;
	
	//Register
	
	@PostMapping("/student/register")
	public String studentRegister(@RequestBody Map<String, String> newStudent) {
		long id = Long.parseLong(newStudent.get("uid"));
		long rollNo = Long.parseLong(newStudent.get("rollNo"));
		String name = newStudent.get("name");
		String course = newStudent.get("course");
		String branch = newStudent.get("branch");
		String email = newStudent.get("email");
		String pass = newStudent.get("pass");
		StudentModel newStu = repo.register(id, rollNo, name, course, branch, email, pass);
		if(newStu != null) {
			return "Registration Successful";
		}
		return "Registration Failed";
	}
	
	//Login
	
	@PostMapping("/student/login")
	public String login(@RequestBody StudentLoginDTO loginUser) {
//		long id =  Long.parseLong(loginUser.get("id"));
//		String email = loginUser.get("email");
//		String pass = loginUser.get("pass");
		StudentModel login = repo.login(loginUser.getId(), loginUser.getEmail(), loginUser.getPass());
		if(login != null) {
			StudentLoginResDTO res = new StudentLoginResDTO(HttpStatus.OK, login.getName(), login.getRollNo(), login.getEmail(), login.getId());
			return "Login Successful";
		}
		return "Login Failed";
	}
	
	
	@GetMapping("/student/show_all")
	public ArrayList<StudentModel> showAll(){
		return repo.showAll();
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
