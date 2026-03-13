package com.crudapp.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.app.repositories.AdminRepository;


@RestController
public class AdminController {
	
	@Autowired
	AdminRepository repo;
	
	@PatchMapping("/admin/manage_user/{id}")
	public String manageUserStatus(@PathVariable long id) {
		boolean resp = repo.manageAccess(id);
		if(resp == true) {
			return "The account has been banned.";
		}else {
			return "The account has been un-banned";
		}
	}
}
