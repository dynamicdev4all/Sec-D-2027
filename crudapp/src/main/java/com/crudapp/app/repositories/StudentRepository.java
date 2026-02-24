package com.crudapp.app.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crudapp.app.models.StudentModel;

@Service
public class StudentRepository {
	Map<Long, StudentModel> db = new HashMap<Long, StudentModel>();
	
	
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
