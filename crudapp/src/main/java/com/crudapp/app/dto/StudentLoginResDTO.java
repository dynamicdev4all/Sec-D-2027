package com.crudapp.app.dto;

import org.springframework.http.HttpStatusCode;

public class StudentLoginResDTO {
	HttpStatusCode statusCode;
	String name;
	long rollNo;
	String email;
	long id;
	
	public StudentLoginResDTO(HttpStatusCode statusCode, String name, long rollNo, String email, long id) {
		this.statusCode = statusCode;
		this.name = name;
		this.rollNo = rollNo;
		this.email = email;
		this.id = id;
	}
}
