package com.crudapp.app.models;

import java.util.Date;

public class Attendance {
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	boolean status = false;
//	Date date;
	String date;
	String subject;
}
