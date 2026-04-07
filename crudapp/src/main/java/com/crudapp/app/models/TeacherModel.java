package com.crudapp.app.models;

import java.util.ArrayList;

public class TeacherModel {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSectionAssigned() {
		return sectionAssigned;
	}
	public void setSectionAssigned(String sectionAssigned) {
		this.sectionAssigned = sectionAssigned;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	long id;
	String name;
	String sectionAssigned;
	String email;
	String pass;
}
