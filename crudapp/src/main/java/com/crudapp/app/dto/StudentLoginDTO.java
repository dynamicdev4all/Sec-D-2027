package com.crudapp.app.dto;

public class StudentLoginDTO {
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	String email;
	String pass;
	
	public StudentLoginDTO(long id, String email, String pass) {
		this.id = id;
		this.email = email;
		this.pass = pass;
	}
}
