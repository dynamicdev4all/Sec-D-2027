package com.crudapp.app.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crudapp.app.models.StudentModel;

@Service
public class StudentRepository {
	Map<Long, StudentModel> db = new HashMap<Long, StudentModel>();
//	int current = 1;
	
	//Create Student
	public StudentModel createStudent(StudentModel newStudent) {
		db.put(newStudent.getRollNo(), newStudent);
//		current ++;
		return newStudent;
	}
	
	public StudentModel loginUser(Map<String, String> loginUser) {
		long loginId =Long.parseLong(loginUser.get("id"));
		String loginEmail = loginUser.get("email");
		String loginPass = loginUser.get("pass");
		
		//here we are now searching for the user in the database
		
		StudentModel user =  db.get(loginId);
		
		if(user.getEmail().equals(loginEmail) && user.getPass().equals(loginPass)) {
			return user;
		}
		else {
			return null;
		}
	}
	
	
	//Read All
	public ArrayList<StudentModel> showAll(){
		ArrayList<StudentModel> list = new ArrayList<StudentModel>();
		list.addAll(db.values());
		return list;
	}
	
	//Read One
	public StudentModel showOne(long uid) {
		return db.get(uid);
	}
}
