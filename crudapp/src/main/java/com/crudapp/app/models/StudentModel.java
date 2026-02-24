package com.crudapp.app.models;

public class StudentModel extends User{
	
	int uid;
	long rollNo;
	String name;
	String course;
	String branch;
	String email;
	String pass;
	
	public StudentModel(int uid, long rollNo, String name, String course, String branch, String email, String pass) {
		this.uid = uid;
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.branch = branch;
		this.email = email;
		this.pass = pass;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
