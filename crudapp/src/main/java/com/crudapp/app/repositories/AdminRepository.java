package com.crudapp.app.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crudapp.app.models.StudentModel;


@Repository
public class AdminRepository {
	
	
	@Autowired
	StudentRepository repo;
	
	//this fn is used to ban and unban users
	public boolean manageAccess(long userId) {
		//search the user
		StudentModel student =  repo.db.get(userId);
		//here we are checking if the user is banned or not, if the user is not banned then we are banning the user. otherwise we are un-banning the user
		if(student.isBanned() == false) {
			student.setBanned(true);
			return true;
		}else {
			student.setBanned(false);
			return false;
		}
		
	}
	
	
	//this fn is used to update user data for ex : roll no, branch, section, etc
	public void updateUser() {
		
	}
	
	
	// this fn is use to permanently delete user data
	public void deleteUser() {
		
	}
}
