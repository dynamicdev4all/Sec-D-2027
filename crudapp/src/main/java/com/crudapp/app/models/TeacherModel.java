package com.crudapp.app.models;

import java.util.ArrayList;

public class TeacherModel extends User {
	long id;
	String name;
	String sectionAssigned;
	String email;
	String pass;
	ArrayList<Subject> assignedSubjects;
}
