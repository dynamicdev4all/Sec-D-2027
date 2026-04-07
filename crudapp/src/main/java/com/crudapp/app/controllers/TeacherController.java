package com.crudapp.app.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.crudapp.app.models.Attendance;
import com.crudapp.app.models.StudentModel;
import com.crudapp.app.repositories.StudentRepository;

public class TeacherController {
	
	@Autowired
	StudentRepository repo;
	public void markAttendance() {
		ArrayList<StudentModel> studentList =  repo.showAll();
		for(int i = 0; i < studentList.size(); i++) {
			// this code will be executed on frontend instruction
			ArrayList<Attendance> aList = studentList.get(i).getAttendanceList();
			Attendance javaLab = aList.get(0);
			javaLab.setSubject("JAVA LAB - TUESDAY");
			javaLab.setDate("31-March-2026");
			if(req == "Mark Present") {
				javaLab.setStatus(true);
			}else if(req == "Mark Absent"){
				javaLab.setStatus(false);
			}
			
		}
		
	}
}
