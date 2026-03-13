package com.crudapp.app.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.crudapp.app.models.StudentModel;

@Repository
public class StudentRepository {
	Map<Long, StudentModel> db = new HashMap<Long, StudentModel>();
	
	
	
	public StudentModel register(long id, long rollNo, String name, String course, String branch, String email, String pass ) {
		StudentModel newStudent = new StudentModel(id, rollNo, name, course, branch, email, pass);
		try {
			db.put(id, newStudent);
			return newStudent;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	public StudentModel login(long id, String email, String pass) {
		StudentModel student = db.get(id);
		if(student != null) {
			if(student.getEmail().equals(email) && student.getPass().equals(pass)) {
				return student;
			}
			return null;
		}
		return null;
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
