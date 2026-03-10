package com.crudapp.app.repositories;

import org.springframework.beans.factory.annotation.Autowired;

import com.crudapp.app.models.StudentModel;

public class AdminRepository {
	
	
	@Autowired
	StudentRepository repo;
	
	//this fn is used to ban and unban users
	public String manageAccess(long userId) {
		//search the user
		StudentModel student =  repo.db.get(userId);
		//here we are checking if the user is banned or not, if the user is not banned then we are banning the user. otherwise we are un-banning the user
		if(student.isBanned() == false) {
			student.setBanned(true);
			return "Ban success.";
		}else {
			student.setBanned(false);
			return "Un ban success";
		}
		
	}
	
	
	//this fn is used to update user data for ex : roll no, branch, section, etc
	public void updateUser() {
		
	}
	
	
	// this fn is use to permanently delete user data
	public void deleteUser() {
		
	}
}
