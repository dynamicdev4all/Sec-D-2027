package com.crudapp.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crudapp.app.models.User;
import com.crudapp.app.repositories.AuthRepository;

public class AuthController {
	
	@Autowired
	AuthRepository authRepo;

	@PostMapping("/auth/register")
	public String register(@RequestBody User newUser) {
		try {
			 authRepo.register(newUser);
			 return "Registration Successful";
		} catch (Exception e) {
			return "Registration Failed";
		}
	}
	
	@PostMapping("/auth/login")
	public String login(@RequestBody Map<String, String> loginUser) {
		User user = authRepo.login(loginUser);
		if(user != null) {
			return "Login Success";
		}else {
			return "Login Failed";
		}
	}
	public void logout() {
		
	}
	public void resetPassword() {
		
	}
	public void updateAccount() {
		
	}
}
